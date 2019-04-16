package factory;

import domain.booking.Booking;
import domain.staff.Staff;
import factory.bookingFactory.BookingFactory;
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
        Assert.assertEquals(10/04/2019,10/04/2019);

    }
    @Test
    public void getStaff() {
        int staffNumber = 211210471;
        Staff staff = BookingFactory.getStaff("Masivuye",staffNumber);
        Assert.assertEquals(211210471,staffNumber);
        System.out.print(staff.getStaffNumber());
    }
}
