package com.salon.controller.payment;

import com.salon.domain.payment.CardPayment;
import com.salon.factory.paymentFactory.CardPaymentFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class CardPaymentControllerTest {
    private static CardPayment cardPayment;

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/salon/cardPayment";



    @Test
    public void testGetAllCardPayments() {
        HttpHeaders httpHeaders = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, httpHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(baseURL+ "/getAll",
                HttpMethod.GET,entity, String.class);

        assertNotNull(responseEntity.getBody());
    }

    @Ignore
    public void testGetCardPaymentsByBalance() {
        cardPayment = restTemplate.getForObject(baseURL +"/salon/cardPayment", CardPayment.class);
        System.out.println(cardPayment.getBalance(200.00));
        assertNotNull(cardPayment);
    }

    @Ignore
    public void create(){

        CardPayment cardPayment = CardPaymentFactory.getCard(200.00);

        ResponseEntity<CardPayment> responseEntity = restTemplate.postForEntity(baseURL + "/create" , cardPayment, CardPayment.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Ignore
    public void update(){
        double balance = 200.00;
        cardPayment = restTemplate.getForObject(baseURL + "/salon/cardPayment" + balance, CardPayment.class);

        restTemplate.put(baseURL + "/create/" + balance ,CardPayment.class);
        CardPayment updateBalance = restTemplate.getForObject(baseURL + "/salon/cashPayment"+  balance, CardPayment.class);
        assertNotNull(updateBalance);
    }

    @Ignore
    public void delete(){
        double balance = 200.00;

        cardPayment = restTemplate.getForObject(baseURL + "/salon/cardPayment" + cardPayment, CardPayment.class);
        assertNotNull(cardPayment);
        restTemplate.delete(baseURL + "/salon/cashPayment" + balance);

        try{
            cardPayment = restTemplate.getForObject(baseURL + "/salon/cashPayment" + balance, CardPayment.class);
        }
        catch (final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }


    }
}
