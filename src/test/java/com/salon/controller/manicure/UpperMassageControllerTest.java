package com.salon.controller.manicure;

import com.salon.domain.manicure.UpperMassage;
import com.salon.factory.manicureFactory.UpperMassageFactory;
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
public class UpperMassageControllerTest {
    private static UpperMassage upperMassage;

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/salon/UpperMassage";



    @Test
    public void testGetAllUpperMassage() {
        HttpHeaders httpHeaders = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, httpHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(baseURL+ "/getAll",
                HttpMethod.GET,entity, String.class);

        assertNotNull(responseEntity.getBody());
    }

    @Ignore
    public void testGetUpperMassageByPrice() {
        upperMassage = restTemplate.getForObject(baseURL +"/salon/UpperMassage", UpperMassage.class);
        System.out.println(upperMassage.getPrice());
        assertNotNull(upperMassage);
    }

    @Ignore
    public void create(){
        double price = 100.00 ;

        upperMassage = UpperMassageFactory.getUpperMassage(100.00);

        ResponseEntity<UpperMassage> responseEntity = restTemplate.postForEntity(baseURL + "/create" , upperMassage, UpperMassage.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Ignore
    public void update(){

        upperMassage = restTemplate.getForObject(baseURL + "/salon/UpperMassage" + 150.00, UpperMassage.class);

        restTemplate.put(baseURL + "/create/" + 150.00 ,UpperMassage.class);
        UpperMassage updatePrice = restTemplate.getForObject(baseURL + "/salon/UpperMassage"+ 150.00, UpperMassage.class);
        assertNotNull(updatePrice);
    }

    @Ignore
    public void delete(){


        upperMassage = restTemplate.getForObject(baseURL + "/salon/UpperMassage" + 150.00, UpperMassage.class);
        assertNotNull(upperMassage);
        restTemplate.delete(baseURL + "/salon/UpperMassage" + 400.00);

        try{
            upperMassage = restTemplate.getForObject(baseURL + "/salon/UpperMassage" + 150.00, UpperMassage.class);
        }
        catch (final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }

    }
}
