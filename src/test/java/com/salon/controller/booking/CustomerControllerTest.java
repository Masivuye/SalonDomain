package com.salon.controller.booking;


import com.salon.domain.booking.Customer;
import com.salon.factory.bookingFactory.CustomerFactory;
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
public class CustomerControllerTest {
    private static Customer customer;

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/salon/customer";



    @Test
    public void testGetAllCustomers() {
        HttpHeaders httpHeaders = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, httpHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(baseURL+ "/getAll",
                HttpMethod.GET,entity, String.class);

        assertNotNull(responseEntity.getBody());
    }

    @Ignore
    public void testGetCustomerByNumber() {
        customer = restTemplate.getForObject(baseURL +"/salon/customer/12", Customer.class);
        System.out.println(customer.getCustNumber());
        assertNotNull(customer);
    }

    @Ignore
    public void create(){


        customer = CustomerFactory.getCustomer("Masi",12);

        ResponseEntity<Customer> responseEntity = restTemplate.postForEntity(baseURL + "/create" , customer, Customer.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Ignore
    public void update(){
        int number = 15;
        customer = restTemplate.getForObject(baseURL + "/salon/customer" + number, Customer.class);

        restTemplate.put(baseURL + "/create/" +number ,Customer.class);
        Customer updateCustomer = restTemplate.getForObject(baseURL + "/salon/customer" + number, Customer.class);
        assertNotNull(updateCustomer);
    }

    @Ignore
    public void delete(){
        int number = 15;

        customer = restTemplate.getForObject(baseURL + "/salon/customer" + number, Customer.class);
        assertNotNull(customer);
        restTemplate.delete(baseURL + "/salon/customer" + number);

        try{
            customer = restTemplate.getForObject(baseURL + "/salon/customer" + number, Customer.class);
        }
        catch (final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }


    }
}
