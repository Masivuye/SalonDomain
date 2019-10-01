package com.salon.controller.payment;

import com.salon.domain.payment.Debit;
import com.salon.factory.paymentFactory.DebitFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.ResourceAccessException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class DebitControllerTest {
    private static Debit debit;

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/salon/debit";



    @Test(expected = ResourceAccessException.class)
    public void testGetAllDebit() {
        HttpHeaders httpHeaders = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, httpHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(baseURL+ "/getAll",
                HttpMethod.GET,entity, String.class);

        assertNotNull(responseEntity.getBody());
    }

    @Test(expected = ResourceAccessException.class)
    public void testGetDebitByBalance() {
        debit = restTemplate.getForObject(baseURL +"/salon/debit", Debit.class);
        System.out.println(debit.getBalance(200.00));
        assertNotNull(debit);
    }

    @Test(expected = ResourceAccessException.class)
    public void create(){

        Debit debit = DebitFactory.getDebit(500.00);

        ResponseEntity<Debit> responseEntity = restTemplate.postForEntity(baseURL + "/create" , debit, Debit.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test(expected = ResourceAccessException.class)
    public void update(){
        double balance = 200.00;
        debit = restTemplate.getForObject(baseURL + "/salon/debit" + balance, Debit.class);

        restTemplate.put(baseURL + "/create/" + balance ,Debit.class);
        Debit updateBalance = restTemplate.getForObject(baseURL + "/salon/debit"+  balance, Debit.class);
        assertNotNull(updateBalance);
    }

    @Test(expected = ResourceAccessException.class)
    public void delete(){
        double balance = 200.00;

        debit = restTemplate.getForObject(baseURL + "/salon/debit" + debit, Debit.class);
        assertNotNull(debit);
        restTemplate.delete(baseURL + "/salon/debit" + balance);

        try{
            debit = restTemplate.getForObject(baseURL + "/salon/debit" + balance, Debit.class);
        }
        catch (final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }


    }
}
