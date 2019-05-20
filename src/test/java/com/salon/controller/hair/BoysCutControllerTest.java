package com.salon.controller.hair;

import com.salon.domain.hair.BoysCut;
import com.salon.factory.hairFactory.BoysCutFactory;
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
public class BoysCutControllerTest {
    private static BoysCut boysCut;

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/salon/BoysCut";



    @Test
    public void testGetAllBoysCut() {
        HttpHeaders httpHeaders = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, httpHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(baseURL+ "/getAll",
                HttpMethod.GET,entity, String.class);

        assertNotNull(responseEntity.getBody());
    }

    @Ignore
    public void testGetBoysCutByPrice() {
        boysCut = restTemplate.getForObject(baseURL +"/salon/BoysCut/100.00", BoysCut.class);
        System.out.println(boysCut.getPrice());
        assertNotNull(boysCut);
    }

    @Ignore
    public void create(){
        String[] types = {"chiskop,English cut"};
       BoysCut boysCut = BoysCutFactory.getBoysCut(types,100.00);

        ResponseEntity<BoysCut> responseEntity = restTemplate.postForEntity(baseURL + "/create" , boysCut, BoysCut.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Ignore
    public void update(){
        double price = 200.00;
        boysCut = restTemplate.getForObject(baseURL + "/salon/BoysCut" +price, BoysCut.class);

        restTemplate.put(baseURL + "/create/" +price ,BoysCut.class);
        BoysCut updatePrice = restTemplate.getForObject(baseURL + "/salon/BoysCut"+price, BoysCut.class);
        assertNotNull(updatePrice);
    }

    @Ignore
    public void delete(){
        double price = 200.00;

        boysCut = restTemplate.getForObject(baseURL + "/salon/BoysCut" +price, BoysCut.class);
        assertNotNull(boysCut);
        restTemplate.delete(baseURL + "/salon/BoysCut" + price);

        try{
            boysCut = restTemplate.getForObject(baseURL + "/salon/BoysCut"+price, BoysCut.class);
        }
        catch (final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }


    }
}
