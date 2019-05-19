package com.salon.controller.staff;

import com.salon.domain.staff.Staff;
import com.salon.factory.staffFactory.StaffFactory;
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
public class StaffControllerTest {
    private static Staff staff;

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/salon/staff";



    @Test
    public void testGetAllStaff() {
        HttpHeaders httpHeaders = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, httpHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(baseURL+ "/getAll",
                HttpMethod.GET,entity, String.class);

        assertNotNull(responseEntity.getBody());
    }

    @Ignore
    public void testGetStaffByNumber() {
        staff = restTemplate.getForObject(baseURL +"/salon/staff", Staff.class);
        System.out.println(staff.getStaffNumber());
        assertNotNull(staff);
    }

    @Ignore
    public void create(){

        String[] names = {"Thandiswa "," Masivuye"};
        staff = StaffFactory.getStaff(names,125);

        ResponseEntity<Staff> responseEntity = restTemplate.postForEntity(baseURL + "/create" , staff, Staff.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Ignore
    public void update(){
        int number = 185;
        staff = restTemplate.getForObject(baseURL + "/salon/staff" +number, Staff.class);

        restTemplate.put(baseURL + "/create/" +number ,Staff.class);
        Staff updateStaff = restTemplate.getForObject(baseURL + "/salon/staff"+number, Staff.class);
        assertNotNull(updateStaff);
    }

    @Ignore
    public void delete(){
        int number = 185;

        staff = restTemplate.getForObject(baseURL + "/salon/staff" +number, Staff.class);
        assertNotNull(staff);
        restTemplate.delete(baseURL + "/salon/staff" + number);

        try{
            staff = restTemplate.getForObject(baseURL + "/salon/staff"+number, Staff.class);
        }
        catch (final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }


    }
}
