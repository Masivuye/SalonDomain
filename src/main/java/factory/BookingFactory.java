package factory;

import domain.Booking;

import java.util.Date;

public class BookingFactory {

    public static Booking getBooking(Date date, int bookingNumber){
        return new Booking.Builder().date(date)
                    .bookingNumber(bookingNumber)
                .build();
    }
}
