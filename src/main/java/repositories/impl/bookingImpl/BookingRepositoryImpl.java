package repositories.impl.bookingImpl;

import domain.booking.Booking;
import repositories.bookingRepository.BookingRepository;

import java.util.*;


public class BookingRepositoryImpl implements BookingRepository {

    private static BookingRepositoryImpl repository = null;
    private Map<String,Booking> bookingTable;

    private BookingRepositoryImpl() {
        bookingTable = new HashMap<>();

    }
    public static BookingRepository getRepository(){
        if(repository == null) repository = new BookingRepositoryImpl();
        return repository;
    }


    @Override
    public Booking create(Booking booking) {
        bookingTable.put(booking.getDate(),booking);
        Booking booking1 = bookingTable.get(booking.getDate());
        return booking1;
    }

    @Override
    public Booking update(Booking booking) {
        bookingTable.put(booking.getDate(),booking);
        Booking booking1 = bookingTable.get(booking.getDate());
        return booking1;
    }

    @Override
    public void delete(Date date) {

    }

    @Override
    public Booking read(Date date) {

        return null;
    }
    @Override
    public Set<Booking> getAll() {
        return null;
    }
}
