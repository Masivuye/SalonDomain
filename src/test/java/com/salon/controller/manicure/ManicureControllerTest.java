package com.salon.controller.manicure;

import com.salon.domain.manicure.Manicure;
import com.salon.factory.manicureFactory.ManicureFactory;
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
public class ManicureControllerTest {
    private static Manicure manicure;

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/salon/manicure";



    @Test
    public void testGetAllManicure() {
        HttpHeaders httpHeaders = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, httpHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(baseURL+ "/getAll",
                HttpMethod.GET,entity, String.class);

        assertNotNull(responseEntity.getBody());
    }

    @Ignore
    public void testGetManicureByTypes() {
        manicure = restTemplate.getForObject(baseURL +"/salon/manicure", Manicure.class);
        System.out.println(manicure.getTypes());
        assertNotNull(manicure);
    }

    @Ignore
    public void create(){
        String[] types = {"Massage,Nails"};
        String[] colors = {"Blue,pink"};
        manicure = ManicureFactory.getManicure(types,colors);

        ResponseEntity<Manicure> responseEntity = restTemplate.postForEntity(baseURL + "/create" , manicure, Manicure.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Ignore
    public void update(){
        String[] colors = {"Red,pink"};
        manicure = restTemplate.getForObject(baseURL + "/salon/manicure" + colors, Manicure.class);

        restTemplate.put(baseURL + "/create/" + colors ,Manicure.class);
        Manicure updateColor = restTemplate.getForObject(baseURL + "/salon/manicure"+ colors, Manicure.class);
        assertNotNull(updateColor);
    }

    @Ignore
    public void delete(){
        String[] colors = {"Red,pink"};

        manicure = restTemplate.getForObject(baseURL + "/salon/manicure" + colors, Manicure.class);
        assertNotNull(manicure);
        restTemplate.delete(baseURL + "/salon/manicure" + colors);

        try{
            manicure = restTemplate.getForObject(baseURL + "/salon/manicure" + colors, Manicure.class);
        }
        catch (final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }


    }
}
