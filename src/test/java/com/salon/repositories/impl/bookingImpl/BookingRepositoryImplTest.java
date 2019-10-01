package com.salon.repositories.impl.bookingImpl;

import com.salon.domain.booking.Booking;
import com.salon.factory.bookingFactory.BookingFactory;
import com.salon.repositories.bookingRepository.BookingRepository;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.Set;

import static org.junit.Assert.*;

public class BookingRepositoryImplTest {

    BookingRepository repository;
    private Booking booking;

    @Before
    public void setUp() throws Exception {
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();

        //repository = BookingRepository.getRepository();
        this.booking = BookingFactory.getBooking(date,12);
    }

    @Test
    public  void getAll(){
        Set<Booking> bookings = (Set<Booking>) this.repository.findAll();
        System.out.println("getAll = " +bookings);
    }

    @Test
    public void create() throws Exception {
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        Booking booking = BookingFactory.getBooking(date,211210471);
        repository.save(booking);
        assertEquals(date,booking.getDate());
    }

    @Test()
    public void read() throws Exception {
        int num = 211210471;
        Booking read = this.repository.save(booking);
        System.out.println("In read = "+read);
        assertNotEquals(read,booking.getBookingNumber());
    }

    @Test()
    public void update() throws Exception {
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        int bookingNumber = 12;
        Booking update = new Booking.Builder().date(date).bookingNumber(bookingNumber).build();
        System.out.println("In update = "+update);
        this.repository.save(update);
        assertEquals(12,update.getBookingNumber());
        assertSame(date,update.getDate());
    }

    @Test ()
    public void delete() throws Exception {
        int number = 0;
        repository.delete(booking);
        assertNull(booking);
    }
}