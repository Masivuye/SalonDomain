package com.salon.controller.payment;

import com.salon.domain.payment.Credit;
import com.salon.factory.paymentFactory.CreditFactory;
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
public class CreditControllerTest {
    private static Credit credit;

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/salon/credit";



    @Test
    public void testGetAllCredit() {
        HttpHeaders httpHeaders = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, httpHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(baseURL+ "/getAll",
                HttpMethod.GET,entity, String.class);

        assertNotNull(responseEntity.getBody());
    }

    @Ignore
    public void testGetCreditByBalance() {
        credit = restTemplate.getForObject(baseURL +"/salon/credit", Credit.class);
        System.out.println(credit.getBalance(200.00));
        assertNotNull(credit);
    }

    @Ignore
    public void create(){

        Credit credit = CreditFactory.getCredit(600.00);

        ResponseEntity<Credit> responseEntity = restTemplate.postForEntity(baseURL + "/create" , credit, Credit.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Ignore
    public void update(){
        double balance = 200.00;
        credit = restTemplate.getForObject(baseURL + "/salon/credit" + balance, Credit.class);

        restTemplate.put(baseURL + "/create/" + balance ,Credit.class);
        Credit updateBalance = restTemplate.getForObject(baseURL + "/salon/credit"+  balance, Credit.class);
        assertNotNull(updateBalance);
    }

    @Ignore
    public void delete(){
        double balance = 200.00;

        credit = restTemplate.getForObject(baseURL + "/salon/credit" + credit, Credit.class);
        assertNotNull(credit);
        restTemplate.delete(baseURL + "/salon/credit" + balance);

        try{
            credit = restTemplate.getForObject(baseURL + "/salon/credit" + balance, Credit.class);
        }
        catch (final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }


    }
}
