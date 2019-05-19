package com.salon.controller.orders;

import com.salon.domain.orders.Order;
import com.salon.factory.ordersFactory.OderFactory;
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
public class OrderControllerTest {
    private static Order order;

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/salon/Order";



    @Test
    public void testGetAllOrders() {
        HttpHeaders httpHeaders = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, httpHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(baseURL+ "/getAll",
                HttpMethod.GET,entity, String.class);

        assertNotNull(responseEntity.getBody());
    }

    @Ignore
    public void testGetOrdersByName() {
        order = restTemplate.getForObject(baseURL +"/salon/Order", Order.class);
        System.out.println(order.getName());
        assertNotNull(order);
    }

    @Ignore
    public void create(){
        String  name = "Revlon";

        order = OderFactory.getOrders(name,25.00);

        ResponseEntity<Order> responseEntity = restTemplate.postForEntity(baseURL + "/create" , order, Order.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Ignore
    public void update(){
        String name = "RestorePlus";
       order  = restTemplate.getForObject(baseURL + "/salon/Order" + name, Order.class);

        restTemplate.put(baseURL + "/create/" + name ,Order.class);
        Order updateName = restTemplate.getForObject(baseURL + "/salon/Order"+ name, Order.class);
        assertNotNull(updateName);
    }

    @Ignore
    public void delete(){
        String name = "RestorePlus";

        order = restTemplate.getForObject(baseURL + "/salon/Order" + name, Order.class);
        assertNotNull(order);
        restTemplate.delete(baseURL + "/salon/Order" + name);

        try{
            order = restTemplate.getForObject(baseURL + "/salon/Order" + name, Order.class);
        }
        catch (final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }


    }
}
