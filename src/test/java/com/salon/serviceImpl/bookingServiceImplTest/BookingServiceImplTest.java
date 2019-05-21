package com.salon.serviceImpl.bookingServiceImplTest;

import com.salon.domain.booking.Booking;
import com.salon.factory.bookingFactory.BookingFactory;
//import com.salon.repositories.impl.bookingImpl.BookingRepositoryImpl;
import com.salon.repositories.impl.bookingImpl.*;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.*;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BookingServiceImplTest {


    private BookingRepositoryImpl repository;
    private Booking booking;

    private Booking getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        this.repository = BookingRepositoryImpl.getRepository();


    @Test
    public void create() {
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        Booking booking = BookingFactory.getBooking(date,12);
        repository.create(booking);
        assertEquals(date,booking.getDate());
    }

    @Test()
    public void read() throws Exception {
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        repository.delete(date);
        Booking booking = repository.read(date);
        assertNull(booking);
    }

    @Test()
    public void update() throws Exception {
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        Booking booking = BookingFactory.getBooking(date,12);
        repository.update(booking);
        assertEquals(date,booking.getDate());
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