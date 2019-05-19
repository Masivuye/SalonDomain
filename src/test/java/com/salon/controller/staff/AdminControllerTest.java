package com.salon.controller.staff;

import com.salon.domain.staff.Admin;
import com.salon.factory.staffFactory.AdminFactory;
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
public class AdminControllerTest {
    private static Admin admin;

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/salon/admin";



    @Test
    public void testGetAllAdmin() {
        HttpHeaders httpHeaders = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, httpHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(baseURL+ "/getAll",
                HttpMethod.GET,entity, String.class);

        assertNotNull(responseEntity.getBody());
    }

    @Ignore
    public void testGetAdminByNumber() {
        admin = restTemplate.getForObject(baseURL +"/salon/admin", Admin.class);
        System.out.println(admin.getAdnum());
        assertNotNull(admin);
    }

    @Ignore
    public void create(){

        int num =1236;
       Admin admin = AdminFactory.getAmin("Sinawo",num);

        ResponseEntity<Admin> responseEntity = restTemplate.postForEntity(baseURL + "/create" , admin, Admin.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Ignore
    public void update(){
        int number = 1436;
        admin = restTemplate.getForObject(baseURL + "/salon/admin" +number, Admin.class);

        restTemplate.put(baseURL + "/create/" +number ,Admin.class);
        Admin updateAdmin = restTemplate.getForObject(baseURL + "/salon/admin"+number, Admin.class);
        assertNotNull(updateAdmin);
    }

    @Ignore
    public void delete(){
        int number = 1436;

        admin = restTemplate.getForObject(baseURL + "/salon/admin" +number, Admin.class);
        assertNotNull(admin);
        restTemplate.delete(baseURL + "/salon/admin" + number);

        try{
            admin = restTemplate.getForObject(baseURL + "/salon/admin"+number, Admin.class);
        }
        catch (final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }


    }
}
