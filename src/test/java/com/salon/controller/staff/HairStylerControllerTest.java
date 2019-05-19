package com.salon.controller.staff;

import com.salon.domain.hair.HairStyle;
import com.salon.domain.staff.HairStyler;
import com.salon.factory.staffFactory.HairStylerFactory;
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
public class HairStylerControllerTest {
    private static HairStyler hairStyler;

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/salon/hairStyler";



    @Test
    public void testGetAllHairStyler() {
        HttpHeaders httpHeaders = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, httpHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(baseURL+ "/getAll",
                HttpMethod.GET,entity, String.class);

        assertNotNull(responseEntity.getBody());
    }

    @Ignore
    public void testGetHairStylerByNumber() {
        hairStyler = restTemplate.getForObject(baseURL +"/salon/hairStyler", HairStyler.class);
        System.out.println(hairStyler.getStylnum());
        assertNotNull(hairStyler);
    }

    @Ignore
    public void create(){

        int num =1236;
        HairStyler hairStyler = HairStylerFactory.getHairStyler("Thimna",1236);

        ResponseEntity<HairStyler> responseEntity = restTemplate.postForEntity(baseURL + "/create" , hairStyler, HairStyler.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Ignore
    public void update(){
        int number = 1436;
        hairStyler = restTemplate.getForObject(baseURL + "/salon/hairStyler" +number, HairStyler.class);

        restTemplate.put(baseURL + "/create/" +number ,HairStyler.class);
        HairStyler updateHairStyler = restTemplate.getForObject(baseURL + "/salon/hairStyler"+number, HairStyler.class);
        assertNotNull(updateHairStyler);
    }

    @Ignore
    public void delete(){

        int number = 1436;

        hairStyler = restTemplate.getForObject(baseURL + "/salon/hairStyler" +number, HairStyler.class);
        assertNotNull(hairStyler);
        restTemplate.delete(baseURL + "/salon/hairStyler" + number);

        try{
            hairStyler = restTemplate.getForObject(baseURL + "/salon/hairStyler" + number, HairStyler.class);
        }
        catch (final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }


    }
}
