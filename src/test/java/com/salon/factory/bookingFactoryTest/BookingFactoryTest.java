package com.salon.factory.bookingFactoryTest;

import com.salon.domain.booking.Booking;
import com.salon.factory.bookingFactory.BookingFactory;
import org.junit.Assert;
import org.junit.Test;
import java.util.Calendar;
import java.util.Date;

public class BookingFactoryTest {


    @Test
    public void getBooking(){
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        Booking booking = BookingFactory.getBooking(date,12);
        System.out.println("Booking date is: "+booking.getDate());
        Assert.assertEquals(booking.getDate(),booking.getDate());

    }

}
