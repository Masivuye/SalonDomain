package com.salon.controller.orders;

import com.salon.domain.orders.ImportSupplier;
import com.salon.factory.ordersFactory.ImportSupplierFactory;
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
public class ImportSupplierControllerTest {
    private static ImportSupplier importSupplier;

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/salon/ImportSupplier";



    @Test(expected = ResourceAccessException.class)
    public void testGetAllImportSupplier() {
        HttpHeaders httpHeaders = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, httpHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(baseURL+ "/getAll",
                HttpMethod.GET,entity, String.class);

        assertNotNull(responseEntity.getBody());
    }

    @Test(expected = ResourceAccessException.class)
    public void testGetImportSupplierByName() {
        importSupplier = restTemplate.getForObject(baseURL +"/salon/ImportSupplier", ImportSupplier.class);
        System.out.println(importSupplier.getName());
        assertNotNull(importSupplier);
    }

    @Test(expected = ResourceAccessException.class)
    public void create(){
        String  name = "Revlon";

        ImportSupplier importSupplier = ImportSupplierFactory.getImports("Shoprite",12);

        ResponseEntity<ImportSupplier> responseEntity = restTemplate.postForEntity(baseURL + "/create" , importSupplier, ImportSupplier.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test(expected = ResourceAccessException.class)
    public void update(){
        String name = "E-Styles";
        importSupplier  = restTemplate.getForObject(baseURL + "/salon/ImportSupplier" + name, ImportSupplier.class);

        restTemplate.put(baseURL + "/create/" + name ,ImportSupplier.class);
        ImportSupplier updateName = restTemplate.getForObject(baseURL + "/salon/ImportSupplier"+ name, ImportSupplier.class);
        assertNotNull(updateName);
    }

    @Test(expected = ResourceAccessException.class)
    public void delete(){
        String name = "E-Styles";

        importSupplier = restTemplate.getForObject(baseURL + "/salon/ImportSupplier" + name, ImportSupplier.class);
        assertNotNull(importSupplier);
        restTemplate.delete(baseURL + "/salon/ImportSupplier" + name);

        try{
            importSupplier = restTemplate.getForObject(baseURL + "/salon/ImportSupplier" + name, ImportSupplier.class);
        }
        catch (final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }


    }
}
