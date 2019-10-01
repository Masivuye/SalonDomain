package com.salon.controller.manicure;

import com.salon.domain.manicure.Nails;
import com.salon.factory.manicureFactory.NailsFactory;
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
public class NailsControllerTest {
    private static Nails nails;

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/salon/Nails";



    @Test(expected = ResourceAccessException.class)
    public void testGetAllNails() {
        HttpHeaders httpHeaders = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, httpHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(baseURL+ "/getAll",
                HttpMethod.GET,entity, String.class);

        assertNotNull(responseEntity.getBody());
    }

    @Test(expected = ResourceAccessException.class)
    public void testGetNailsByColors() {
        nails = restTemplate.getForObject(baseURL +"/salon/Nails", Nails.class);
        System.out.println(nails.getColors());
        assertNotNull(nails);
    }

    @Test(expected = ResourceAccessException.class)
    public void create(){
        String[] colors = {"Pink, Black"};
        String[] shapes = {"Oval, Square"};

        nails = NailsFactory.getNails(colors,shapes);

        ResponseEntity<Nails> responseEntity = restTemplate.postForEntity(baseURL + "/create" , colors, Nails.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test(expected = ResourceAccessException.class)
    public void update(){
        String[] colors = {"Green, Pink"};

        nails = restTemplate.getForObject(baseURL + "/salon/Nails" + colors, Nails.class);

        restTemplate.put(baseURL + "/create/" + colors ,Nails.class);
        Nails updateColors = restTemplate.getForObject(baseURL + "/salon/Nails"+ colors, Nails.class);
        assertNotNull(updateColors);
    }

    @Test(expected = ResourceAccessException.class)
    public void delete(){
        String[] colors = {"Green, Pink"};

        nails = restTemplate.getForObject(baseURL + "/salon/Nails" + colors, Nails.class);
        assertNotNull(nails);
        restTemplate.delete(baseURL + "/salon/Nails" + colors);

        try{
            nails = restTemplate.getForObject(baseURL + "/salon/Nails" + colors, Nails.class);
        }
        catch (final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }

    }
}
