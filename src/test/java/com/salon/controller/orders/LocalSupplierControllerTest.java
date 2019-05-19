package com.salon.controller.orders;

import com.salon.domain.orders.LocalSuppliers;
import com.salon.factory.ordersFactory.LocalSuppliersFactory;
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
public class LocalSupplierControllerTest {
    private static LocalSuppliers localSuppliers;

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/salon/LocalSuppliers";



    @Test
    public void testGetAllLocalSuppliers() {
        HttpHeaders httpHeaders = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, httpHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(baseURL+ "/getAll",
                HttpMethod.GET,entity, String.class);

        assertNotNull(responseEntity.getBody());
    }

    @Ignore
    public void testGetLocalSuppliersByName() {
        localSuppliers = restTemplate.getForObject(baseURL +"/salon/LocalSuppliers", LocalSuppliers.class);
        System.out.println(localSuppliers.getName());
        assertNotNull(localSuppliers);
    }

    @Ignore
    public void create(){

        LocalSuppliers localSuppliers = LocalSuppliersFactory.getLocal("Clicks",15);

        ResponseEntity<LocalSuppliers> responseEntity = restTemplate.postForEntity(baseURL + "/create" , localSuppliers, LocalSuppliers.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Ignore
    public void update(){
        String name = "Exclusive Virgin Hair";
        localSuppliers  = restTemplate.getForObject(baseURL + "/salon/LocalSuppliers" + name, LocalSuppliers.class);

        restTemplate.put(baseURL + "/create/" + name ,LocalSuppliers.class);
        LocalSuppliers updateName = restTemplate.getForObject(baseURL + "/salon/LocalSuppliers"+ name, LocalSuppliers.class);
        assertNotNull(updateName);
    }

    @Ignore
    public void delete(){
        String name = "Exclusive Virgin Hair";

        localSuppliers = restTemplate.getForObject(baseURL + "/salon/LocalSuppliers" + name, LocalSuppliers.class);
        assertNotNull(localSuppliers);
        restTemplate.delete(baseURL + "/salon/LocalSuppliers" + name);

        try{
            localSuppliers = restTemplate.getForObject(baseURL + "/salon/LocalSuppliers" + name, LocalSuppliers.class);
        }
        catch (final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }


    }
}
