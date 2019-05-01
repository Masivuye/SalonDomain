package service.impl;

import domain.booking.Booking;
import factory.bookingFactory.BookingFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import repositories.bookingRepository.BookingRepository;
import repositories.impl.bookingImpl.BookingRepositoryImpl;

import java.util.*;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BookingServiceImplTest {


    Map<Integer, Date> values;
    BookingRepository repository;

    @Before
    public void setUp() throws Exception {
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        repository = BookingRepositoryImpl.getRepository();
        values = new HashMap<Integer, Date>();
        values.put(12,date);
        values.put(13,date);
        values.put(14,date);
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
        Booking readBooing = repository.read(date);
        assertEquals(date,readBooing.bookingNumber());
    }

    @Test()
    public void update() throws Exception {
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        int bookingNumber = 12;
        Booking booing = repository.read(date);
        Booking newBooking = new Booking.Builder().date(date)
                .bookingNumber(bookingNumber)
                .build();
        repository.update(newBooking);
        Booking updateBooing = repository.read(date);
        assertEquals(date,updateBooing.getDate());
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