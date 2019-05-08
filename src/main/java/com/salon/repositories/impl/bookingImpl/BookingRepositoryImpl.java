package com.salon.repositories.impl.bookingImpl;

import com.salon.domain.booking.Booking;
import com.salon.repositories.bookingRepository.BookingRepository;

import java.util.*;


public class BookingRepositoryImpl implements BookingRepository {

    private static BookingRepositoryImpl repository = null;
    private Map<Date,Booking> bookingTable;

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
        bookingTable.remove(date);

    }

    @Override
    public Booking read(Date date) {
        Booking booking = bookingTable.get(date);
        return booking;
    }
    @Override
    public Set<Booking> getAll() {
        return null;
    }
}
