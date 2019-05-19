package com.salon.controller.orders;

import com.salon.domain.orders.Supplier;
import com.salon.factory.ordersFactory.SupplierFactory;
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
public class SupplierControllerTest {
    private static Supplier supplier;

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/salon/Supplier";



    @Test
    public void testGetAllSuppliers() {
        HttpHeaders httpHeaders = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, httpHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(baseURL+ "/getAll",
                HttpMethod.GET,entity, String.class);

        assertNotNull(responseEntity.getBody());
    }

    @Ignore
    public void testGetSuppliersByNumber() {
        supplier = restTemplate.getForObject(baseURL +"/salon/Supplier", Supplier.class);
        System.out.println(supplier.getSupNum());
        assertNotNull(supplier);
    }

    @Ignore
    public void create(){

       Supplier supplier = SupplierFactory.getSupplier("Thuli",25);

        ResponseEntity<Supplier> responseEntity = restTemplate.postForEntity(baseURL + "/create" , supplier, Supplier.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Ignore
    public void update(){

        supplier  = restTemplate.getForObject(baseURL + "/salon/Supplier" + 20, Supplier.class);

        restTemplate.put(baseURL + "/create/" + 20,Supplier.class);
        Supplier updateNumber = restTemplate.getForObject(baseURL + "/salon/Supplier"+ 20, Supplier.class);
        assertNotNull(updateNumber);
    }

    @Ignore
    public void delete(){

        supplier = restTemplate.getForObject(baseURL + "/salon/Supplier" + 25, Supplier.class);
        assertNotNull(supplier);
        restTemplate.delete(baseURL + "/salon/Supplier" + 25);

        try{
            supplier = restTemplate.getForObject(baseURL + "/salon/Supplier" + 25, Supplier.class);
        }
        catch (final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }


    }
}
