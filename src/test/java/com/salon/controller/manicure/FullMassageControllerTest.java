package com.salon.controller.manicure;

import com.salon.domain.manicure.FullMassage;
import com.salon.factory.manicureFactory.FullMassageFactory;
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
public class FullMassageControllerTest {
    private static FullMassage fullMassage;

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/salon/FullMassage";



    @Test(expected = ResourceAccessException.class)
    public void testGetAllFullMassage() {
        HttpHeaders httpHeaders = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, httpHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(baseURL+ "/getAll",
                HttpMethod.GET,entity, String.class);

        assertNotNull(responseEntity.getBody());
    }

    @Test(expected = ResourceAccessException.class)
    public void testGetFullMassageByPrice() {
        fullMassage = restTemplate.getForObject(baseURL +"/salon/FullMassage", FullMassage.class);
        System.out.println(fullMassage.getPrice());
        assertNotNull(fullMassage);
    }

    @Test(expected = ResourceAccessException.class)
    public void create(){
        double price = 250.00 ;

        fullMassage = FullMassageFactory.getFullMassage(250.00);

        ResponseEntity<FullMassage> responseEntity = restTemplate.postForEntity(baseURL + "/create" , fullMassage, FullMassage.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test(expected = ResourceAccessException.class)
    public void update(){

        fullMassage = restTemplate.getForObject(baseURL + "/salon/FullMassage" + 400.00, FullMassage.class);

        restTemplate.put(baseURL + "/create/" + 400.00 ,FullMassage.class);
        FullMassage updatePrice = restTemplate.getForObject(baseURL + "/salon/FullMassage"+ 400.00, FullMassage.class);
        assertNotNull(updatePrice);
    }

    @Test(expected = ResourceAccessException.class)
    public void delete(){


        fullMassage = restTemplate.getForObject(baseURL + "/salon/FullMassage" + 400.00, FullMassage.class);
        assertNotNull(fullMassage);
        restTemplate.delete(baseURL + "/salon/FullMassage" + 400.00);

        try{
            fullMassage = restTemplate.getForObject(baseURL + "/salon/FullMassage" + 400.00, FullMassage.class);
        }
        catch (final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }


    }
}
