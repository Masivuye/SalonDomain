package com.salon.repositories.bookingRepositoryTest;

import com.salon.domain.booking.Booking;
import com.salon.factory.bookingFactory.BookingFactory;
import com.salon.repositories.bookingRepository.BookingRepository;
import org.junit.Before;
import org.junit.Test;
import com.salon.repositories.impl.bookingImpl.BookingRepositoryImpl;

import java.util.*;

import static org.junit.Assert.*;

public class BookingRepositoryTest {


    BookingRepository repository;
    private Booking booking;

    @Before
    public void setUp() throws Exception {
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        repository = BookingRepositoryImpl.getRepository();
        this.booking = BookingFactory.getBooking(date,12);
    }

    @Test
    public  void getAll(){
        Set<Booking> bookings = this.repository.getAll();
        System.out.println("getAll = " +bookings);
    }

    @Test
    public void create() throws Exception {
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        Booking booking = BookingFactory.getBooking(date,211210471);
        repository.create(booking);
        assertEquals(date,booking.getDate());
    }

    @Test()
    public void read() throws Exception {
        int num = 211210471;
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        Booking read = this.repository.read(booking.getDate());
        System.out.println("In read = "+read);
        assertNotEquals(read,booking.getDate());
    }

    @Test()
    public void update() throws Exception {
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        int bookingNumber = 12;
        Booking update = new Booking.Builder().date(date).bookingNumber(bookingNumber).build();
        System.out.println("In update = "+update);
        this.repository.update(update);
        assertEquals(12,update.bookingNumber());
        assertSame(date,update.getDate());
    }

    @Test ()
    public void delete() throws Exception {
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        repository.delete(date);
       Booking booking = repository.read(date);
        assertNull(booking);
    }
}