package com.salon.controller.payment;

import com.salon.domain.payment.Payment;
import com.salon.factory.paymentFactory.PaymentFactory;
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
public class PaymentControllerTest {
    private static Payment payment;

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/salon/payment";



    @Test
    public void testGetAllPayments() {
        HttpHeaders httpHeaders = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, httpHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(baseURL+ "/getAll",
                HttpMethod.GET,entity, String.class);

        assertNotNull(responseEntity.getBody());
    }

    @Ignore
    public void testGetPaymentsByType() {
        payment = restTemplate.getForObject(baseURL +"/salon/payment", Payment.class);
        System.out.println(payment.getQuestion());
        assertNotNull(payment);
    }

    @Ignore
    public void create(){

        Payment payment = PaymentFactory.getPayment(true);

        ResponseEntity<Payment> responseEntity = restTemplate.postForEntity(baseURL + "/create" , payment, Payment.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Ignore
    public void update(){
        boolean question = true;
        payment = restTemplate.getForObject(baseURL + "/salon/payment" + question, Payment.class);

        restTemplate.put(baseURL + "/create/" + question ,Payment.class);
        Payment updateQuestion = restTemplate.getForObject(baseURL + "/salon/payment"+  question, Payment.class);
        assertNotNull(updateQuestion);
    }

    @Ignore
    public void delete(){
        boolean question = false;

        payment = restTemplate.getForObject(baseURL + "/salon/payment" + payment, Payment.class);
        assertNotNull(payment);
        restTemplate.delete(baseURL + "/salon/payment" + question);

        try{
            payment = restTemplate.getForObject(baseURL + "/salon/payment" + question, Payment.class);
        }
        catch (final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }


    }
}
