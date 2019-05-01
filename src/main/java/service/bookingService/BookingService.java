package service.bookingService;

import domain.booking.Booking;
import service.serviceInterface.ServiceInterface;

import java.util.Date;
import java.util.Set;

public interface BookingService extends ServiceInterface<Booking, Date> {
    Set<Booking> getAll();
}
