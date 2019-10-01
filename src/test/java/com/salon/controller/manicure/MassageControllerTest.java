package com.salon.controller.manicure;

import com.salon.domain.manicure.Massage;
import com.salon.factory.manicureFactory.MassageFactory;
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
public class MassageControllerTest {
    private static Massage massage;

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/salon/Massage";



    @Test(expected = ResourceAccessException.class)
    public void testGetAllMassage() {
        HttpHeaders httpHeaders = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, httpHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(baseURL+ "/getAll",
                HttpMethod.GET,entity, String.class);

        assertNotNull(responseEntity.getBody());
    }

    @Test(expected = ResourceAccessException.class)
    public void testGetMassageByTypes() {
        massage = restTemplate.getForObject(baseURL +"/salon/Massage", Massage.class);
        System.out.println(massage.getTypes());
        assertNotNull(massage);
    }

    @Test(expected = ResourceAccessException.class)
    public void create(){
        String[] types = {"FullMassage, UpperMassage"};

        massage = MassageFactory.getMassage(types);

        ResponseEntity<Massage> responseEntity = restTemplate.postForEntity(baseURL + "/create" , massage, Massage.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test(expected = ResourceAccessException.class)
    public void update(){
        String[] types = {"FullMassage, UpperMassage"};

        massage = restTemplate.getForObject(baseURL + "/salon/Massage" + types, Massage.class);

        restTemplate.put(baseURL + "/create/" + types ,Massage.class);
        Massage updateTypes = restTemplate.getForObject(baseURL + "/salon/Massage"+ types, Massage.class);
        assertNotNull(updateTypes);
    }

    @Test(expected = ResourceAccessException.class)
    public void delete(){
        String[] types = {"FullMassage, UpperMassage"};

        massage = restTemplate.getForObject(baseURL + "/salon/Massage" + types, Massage.class);
        assertNotNull(massage);
        restTemplate.delete(baseURL + "/salon/Massage" + types);

        try{
            massage = restTemplate.getForObject(baseURL + "/salon/Massage" + types, Massage.class);
        }
        catch (final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }


    }

}
