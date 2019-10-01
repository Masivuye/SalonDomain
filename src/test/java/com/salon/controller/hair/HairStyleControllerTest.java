package com.salon.controller.hair;


import com.salon.domain.hair.HairStyle;
import com.salon.factory.hairFactory.HairStyleFactory;
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
public class HairStyleControllerTest {
    private static HairStyle hairStyle;

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/salon/hairStyle";



    @Test(expected = ResourceAccessException.class)
    public void testGetAllHairStyles() {
        HttpHeaders httpHeaders = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, httpHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(baseURL+ "/getAll",
                HttpMethod.GET,entity, String.class);

        assertNotNull(responseEntity.getBody());
    }

    @Test(expected = ResourceAccessException.class)
    public void testGetHairStyleByPrice() {
        hairStyle = restTemplate.getForObject(baseURL +"/salon/hairStyle/150.00", HairStyle.class);
        System.out.println(hairStyle.getPrice());
        assertNotNull(hairStyle);
    }

    @Test(expected = ResourceAccessException.class)
    public void create(){
       String[] types = {"Boys,Girls"};
        hairStyle = HairStyleFactory.getHairStyle(types,150.00);

        ResponseEntity<HairStyle> responseEntity = restTemplate.postForEntity(baseURL + "/create" , hairStyle, HairStyle.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test(expected = ResourceAccessException.class)
    public void update(){
        double price = 200.00;
        hairStyle = restTemplate.getForObject(baseURL + "/salon/hairStyle" +price, HairStyle.class);

        restTemplate.put(baseURL + "/create/" +price ,HairStyle.class);
        HairStyle updateHair = restTemplate.getForObject(baseURL + "/salon/hairStyle"+price, HairStyle.class);
        assertNotNull(updateHair);
    }

    @Test(expected = ResourceAccessException.class)
    public void delete(){
        double price = 200.00;

        hairStyle = restTemplate.getForObject(baseURL + "/salon/hairStyle" +price, HairStyle.class);
        assertNotNull(hairStyle);
        restTemplate.delete(baseURL + "/salon/hairStyle" + price);

        try{
            hairStyle = restTemplate.getForObject(baseURL + "/salon/hairStyle"+price, HairStyle.class);
        }
        catch (final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }


    }
}
