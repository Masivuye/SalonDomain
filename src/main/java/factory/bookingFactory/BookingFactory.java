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
    public static Customer getCustomer(String name, int custNumber){
        return new Customer.Builder().name("Masivuye")
                .custNumber(211210471)
                .build();
    }

    public static Staff getStaff(String name, int staffNumber){
        return new Staff.Builder().name(name)
                .staffNumber(staffNumber)
                .build();
    }
}
