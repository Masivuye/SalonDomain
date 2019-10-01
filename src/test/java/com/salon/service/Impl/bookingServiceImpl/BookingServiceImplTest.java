package com.salon.service.Impl.bookingServiceImpl;

import com.salon.domain.booking.Booking;
import com.salon.factory.bookingFactory.BookingFactory;
import com.salon.repositories.bookingRepository.BookingRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Calendar;
import java.util.Date;
import java.util.Optional;
import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BookingServiceImplTest {

    Calendar cal = Calendar.getInstance();
    Date date = cal.getTime();

    private BookingRepository repository;
    private Booking booking;

    @Before
    public void setUp() throws Exception {
       // this.repository = (BookingRepositoryImpl) BookingRepositoryImpl.getRepository();
        this.booking = BookingFactory.getBooking(date,12);
    }


    @Test
    public void getAll() {
        Set<Booking> bookings = (Set<Booking>) this.repository;
    }

    @Test
    public void create() {
        Booking created = this.repository.save(this.booking);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.booking);
    }

    @Test
    public void update() {
        int bookingNumber = 1212;
        Booking updated = new Booking.Builder().bookingNumber(bookingNumber).build();
        System.out.println("In update, about_to_updated = " + booking.getBookingNumber());
        this.repository.save(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(bookingNumber, updated.getBookingNumber());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.deleteById(12);
        getAll();
    }

    @Test
    public void read() {
        System.out.println("In read,  = "+ booking.getBookingNumber());
        Optional<Booking> read = this.repository.findById(12);
        System.out.println("In read, read = " + read);
        getAll();
        assertNotEquals(booking,read);
    }
}