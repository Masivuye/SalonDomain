package com.salon.service.Impl.bookingServiceImpl;

import com.salon.domain.booking.Booking;
import com.salon.factory.bookingFactory.BookingFactory;
import com.salon.repositories.impl.bookingImpl.BookingRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Calendar;
import java.util.Date;
import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BookingServiceImplTest {

    Calendar cal = Calendar.getInstance();
    Date date = cal.getTime();

    private BookingRepositoryImpl repository;
    private Booking booking;

    @Before
    public void setUp() throws Exception {
        this.repository = (BookingRepositoryImpl) BookingRepositoryImpl.getRepository();
        this.booking = BookingFactory.getBooking(date,12);
    }


    @Test
    public void getAll() {
        Set<Booking> bookings = this.repository.getAll();
    }

    @Test
    public void create() {
        Booking created = this.repository.create(this.booking);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.booking);
    }

    @Test
    public void update() {
        int bookingNumber = 1212;
        Booking updated = new Booking.Builder().bookingNumber(bookingNumber).build();
        System.out.println("In update, about_to_updated = " + booking.getBookingNumber());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(bookingNumber, updated.getBookingNumber());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(booking.getBookingNumber());
        getAll();
    }

    @Test
    public void read() {
        System.out.println("In read,  = "+ booking.getBookingNumber());
        Booking read = this.repository.read(booking.getBookingNumber());
        System.out.println("In read, read = " + read);
        getAll();
        assertNotEquals(booking,read);
    }
}