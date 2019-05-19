package com.salon.controller.payment;

import com.salon.domain.payment.CashPayment;
import com.salon.factory.paymentFactory.CashPaymentFactory;
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
public class CashPaymentControllerTest {
    private static CashPayment cashPayment;

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/salon/cashPayment";



    @Test
    public void testGetAllCashPayments() {
        HttpHeaders httpHeaders = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, httpHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(baseURL+ "/getAll",
                HttpMethod.GET,entity, String.class);

        assertNotNull(responseEntity.getBody());
    }

    @Ignore
    public void testGetCashPaymentsByType() {
        cashPayment = restTemplate.getForObject(baseURL +"/salon/cashPayment", CashPayment.class);
        System.out.println(cashPayment.getAmount(200.00));
        assertNotNull(cashPayment);
    }

    @Ignore
    public void create(){

       CashPayment  cashPayment = CashPaymentFactory.getCash(200.00);

        ResponseEntity<CashPayment> responseEntity = restTemplate.postForEntity(baseURL + "/create" , cashPayment, CashPayment.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Ignore
    public void update(){
        double price = 200.00;
        cashPayment = restTemplate.getForObject(baseURL + "/salon/cashPayment" + price, CashPayment.class);

        restTemplate.put(baseURL + "/create/" + price ,CashPayment.class);
        CashPayment updatePrice = restTemplate.getForObject(baseURL + "/salon/cashPayment"+  price, CashPayment.class);
        assertNotNull(updatePrice);
    }

    @Ignore
    public void delete(){
        double price = 200.00;

        cashPayment = restTemplate.getForObject(baseURL + "/salon/cashPayment" + cashPayment, CashPayment.class);
        assertNotNull(cashPayment);
        restTemplate.delete(baseURL + "/salon/cashPayment" + price);

        try{
            cashPayment = restTemplate.getForObject(baseURL + "/salon/cashPayment" + price, CashPayment.class);
        }
        catch (final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }


    }
}
