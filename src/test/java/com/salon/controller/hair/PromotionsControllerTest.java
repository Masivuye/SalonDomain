package com.salon.controller.hair;

import com.salon.domain.hair.Promotions;
import com.salon.factory.hairFactory.PromotionsFactory;
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
public class PromotionsControllerTest {
    private static Promotions promotions;

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/salon/Promotions";



    @Test(expected = ResourceAccessException.class)
    public void testGetAllPromotions() {
        HttpHeaders httpHeaders = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, httpHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(baseURL+ "/getAll",
                HttpMethod.GET,entity, String.class);

        assertNotNull(responseEntity.getBody());
    }

    @Test(expected = ResourceAccessException.class)
    public void testGetPromotionByProduct() {
        promotions = restTemplate.getForObject(baseURL +"/salon/Promotions/", Promotions.class);
        System.out.println(promotions.getProducts());
        assertNotNull(promotions);
    }

    @Test(expected = ResourceAccessException.class)
    public void create(){
        String[] products = {"Relaxer, Cut"};
       Promotions promotions = PromotionsFactory.getPromotions(products);

        ResponseEntity<Promotions> responseEntity = restTemplate.postForEntity(baseURL + "/create" , products, Promotions.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test(expected = ResourceAccessException.class)
    public void update(){
        String[] products = {"Relaxer, Cut"};
        promotions = restTemplate.getForObject(baseURL + "/salon/Promotions" +products, Promotions.class);

        restTemplate.put(baseURL + "/create/" +products ,Promotions.class);
        Promotions updateProducts = restTemplate.getForObject(baseURL + "/salon/Promotions"+ products , Promotions.class);
        assertNotNull(updateProducts);
    }

    @Test(expected = ResourceAccessException.class)
    public void delete(){
        String[] products = {"Relaxer, Cut"};

        promotions = restTemplate.getForObject(baseURL + "/salon/Promotions" + products, Promotions.class);
        assertNotNull(promotions);
        restTemplate.delete(baseURL + "/salon/Promotions" + products);

        try{
            promotions = restTemplate.getForObject(baseURL + "/salon/Promotions"+products, Promotions.class);
        }
        catch (final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }


    }
}
