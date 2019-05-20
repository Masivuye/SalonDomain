package com.salon.controller.hair;

import com.salon.domain.hair.GirlsHair;
import com.salon.factory.hairFactory.GirlsHairFactory;
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
public class GirlsHairControllerTest {
    private static GirlsHair girlsHair;

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/salon/GirlsHair";



    @Test
    public void testGetAllGirlsHair() {
        HttpHeaders httpHeaders = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, httpHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(baseURL+ "/getAll",
                HttpMethod.GET,entity, String.class);

        assertNotNull(responseEntity.getBody());
    }

    @Ignore
    public void testGetGirlsHairByPrice() {
        girlsHair = restTemplate.getForObject(baseURL +"/salon/GirlsHair/400.00", GirlsHair.class);
        System.out.println(girlsHair.getPrice());
        assertNotNull(girlsHair);
    }

    @Ignore
    public void create(){
        String[] types = {"Brading,Weave"};
       GirlsHair girlsHair = GirlsHairFactory.getGirlsHair(types,400.00);

        ResponseEntity<GirlsHair> responseEntity = restTemplate.postForEntity(baseURL + "/create" , girlsHair, GirlsHair.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Ignore
    public void update(){
        double price = 600.00;
        girlsHair = restTemplate.getForObject(baseURL + "/salon/GirlsHair" +price, GirlsHair.class);

        restTemplate.put(baseURL + "/create/" +price ,GirlsHair.class);
        GirlsHair updatePrice = restTemplate.getForObject(baseURL + "/salon/GirlsHair"+price, GirlsHair.class);
        assertNotNull(updatePrice);
    }

    @Ignore
    public void delete(){
        double price = 600.00;

        girlsHair = restTemplate.getForObject(baseURL + "/salon/GirlsHair" +price, GirlsHair.class);
        assertNotNull(girlsHair);
        restTemplate.delete(baseURL + "/salon/GirlsHair" + price);

        try{
            girlsHair = restTemplate.getForObject(baseURL + "/salon/BoysCut"+price, GirlsHair.class);
        }
        catch (final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }

    }
}
