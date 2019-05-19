package com.salon.controller.payment;

import com.salon.domain.payment.Cheque;
import com.salon.factory.paymentFactory.ChequeFactory;
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
public class ChequeControllerTest {
    private static Cheque cheque;

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/salon/cheque";



    @Test
    public void testGetAllCheque() {
        HttpHeaders httpHeaders = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, httpHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(baseURL+ "/getAll",
                HttpMethod.GET,entity, String.class);

        assertNotNull(responseEntity.getBody());
    }

    @Ignore
    public void testGetChequeByBalance() {
        cheque = restTemplate.getForObject(baseURL +"/salon/cheque", Cheque.class);
        System.out.println(cheque.getBalance(200.00));
        assertNotNull(cheque);
    }

    @Ignore
    public void create(){

        Cheque cheque = ChequeFactory.getCheque(500.00);

        ResponseEntity<Cheque> responseEntity = restTemplate.postForEntity(baseURL + "/create" , cheque, Cheque.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Ignore
    public void update(){
        double balance = 200.00;
        cheque = restTemplate.getForObject(baseURL + "/salon/cheque" + balance, Cheque.class);

        restTemplate.put(baseURL + "/create/" + balance ,Cheque.class);
        Cheque updatePrice = restTemplate.getForObject(baseURL + "/salon/cheque"+  balance, Cheque.class);
        assertNotNull(updatePrice);
    }

    @Ignore
    public void delete(){
        double balance = 200.00;

        cheque = restTemplate.getForObject(baseURL + "/salon/cardPayment" + cheque, Cheque.class);
        assertNotNull(cheque);
        restTemplate.delete(baseURL + "/salon/cheque" + balance);

        try{
            cheque = restTemplate.getForObject(baseURL + "/salon/cheque" + balance, Cheque.class);
        }
        catch (final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }


    }
}
