package com.salon.controller.staff;

import com.salon.domain.staff.Cleaners;
import com.salon.factory.staffFactory.CleanersFactory;
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
public class CleanersControllerTest {
    private static Cleaners cleaners;

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/salon/cleaners";



    @Test(expected = ResourceAccessException.class)
    public void testGetAllCleaners() {
        HttpHeaders httpHeaders = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, httpHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(baseURL+ "/getAll",
                HttpMethod.GET,entity, String.class);

        assertNotNull(responseEntity.getBody());
    }

    @Test(expected = ResourceAccessException.class)
    public void testGetCleanersByNumber() {
        cleaners = restTemplate.getForObject(baseURL +"/salon/cleaners", Cleaners.class);
        System.out.println(cleaners.getClnNum());
        assertNotNull(cleaners);
    }

    @Test(expected = ResourceAccessException.class)
    public void create(){

        int num =1212;
        Cleaners cleaners = CleanersFactory.getCleaners("Thando",1212);

        ResponseEntity<Cleaners> responseEntity = restTemplate.postForEntity(baseURL + "/create" , cleaners, Cleaners.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test(expected = ResourceAccessException.class)
    public void update(){
        int number = 6452;
        cleaners = restTemplate.getForObject(baseURL + "/salon/cleaners" + number, Cleaners.class);

        restTemplate.put(baseURL + "/create/" + number ,Cleaners.class);
        Cleaners updateCleaners = restTemplate.getForObject(baseURL + "/salon/cleaners" + number, Cleaners.class);
        assertNotNull(updateCleaners);
    }

    @Test(expected = ResourceAccessException.class)
    public void delete(){
        int number = 6452;

        cleaners = restTemplate.getForObject(baseURL + "/salon/cleaners" +number, Cleaners.class);
        assertNotNull(cleaners);
        restTemplate.delete(baseURL + "/salon/cleaners" + number);

        try{
            cleaners = restTemplate.getForObject(baseURL + "/salon/cleaners"+number, Cleaners.class);
        }
        catch (final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }


    }
}
