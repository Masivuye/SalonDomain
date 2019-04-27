package factory.bookingFactory;

import domain.booking.Booking;
import domain.booking.Customer;
import domain.staff.Staff;

import java.util.Date;

public class BookingFactory {

    public static Booking getBooking(Date date, int bookingNumber){
        return new Booking.Builder().date(date)
                    .bookingNumber(bookingNumber)
                .build();

    }

}
