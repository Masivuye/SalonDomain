package repositories.bookingRepository;

import domain.booking.Booking;
import repositories.IRepository.IRepository;

import java.util.*;


public interface BookingRepository extends IRepository<Booking, Date> {
        Set<Booking> getAll();
}
