package com.salon.controller.booking;


import com.salon.domain.booking.Booking;
import com.salon.factory.bookingFactory.BookingFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
    public class BookingControllerTest {

    private static Booking booking;

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/salon/booking";



        @Test
        public void testGetAllBookings() {
            HttpHeaders httpHeaders = new HttpHeaders();

            HttpEntity<String> entity = new HttpEntity<>(null, httpHeaders);
            ResponseEntity<String> responseEntity = restTemplate.exchange(baseURL+ "/getAll",
            HttpMethod.GET,entity, String.class);

            assertNotNull(responseEntity.getBody());
        }

        @Ignore
        public void testGetBookingByNumber() {
            booking = restTemplate.getForObject(baseURL +"/salon/booking/Masi", Booking.class);
            System.out.println(booking.bookingNumber());
            assertNotNull(booking);
        }

        @Ignore
        public void create(){
            Calendar cal = Calendar.getInstance();
            Date date = cal.getTime();

            booking = BookingFactory.getBooking(date,12);

            ResponseEntity<Booking> responseEntity = restTemplate.postForEntity(baseURL + "/create" , booking, Booking.class);
            assertNotNull(responseEntity);
            assertNotNull(responseEntity.getBody());
        }

        @Ignore
        public void update(){
            int number = 15;
             booking = restTemplate.getForObject(baseURL + "/salon/booking" +number, Booking.class);

            restTemplate.put(baseURL + "/create/" +number ,Booking.class);
            Booking updateBooking = restTemplate.getForObject(baseURL + "/salon/booking"+number, Booking.class);
            assertNotNull(updateBooking);
        }

        @Ignore
        public void delete(){
            int number = 15;

             booking = restTemplate.getForObject(baseURL + "/salon/booking" +number, Booking.class);
            assertNotNull(booking);
            restTemplate.delete(baseURL + "/salon/booking" + number);

            try{
                booking = restTemplate.getForObject(baseURL + "/salon/booking"+number, Booking.class);
            }
            catch (final HttpClientErrorException e){
                assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
            }


        }
    }

