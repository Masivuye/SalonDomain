/*
package com.salon.repositories.impl.bookingImpl;


import com.salon.domain.booking.Booking;
import com.salon.repositories.bookingRepository.BookingRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
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
        */
/**bookingTable t = read.getDate()):
         *
         * if (t !=null){
         * Booking updateBooking = new Bokking.Builder()
         * .copy(t)
         * .date(booking.getDate())
         * .build();
         * this.bookingTable.put(t.getDate(), updateBooking)**//*

        bookingTable.put(booking.getDate(),booking);
        Booking booking1 = bookingTable.get(booking.getDate());
        return booking1;
    }

    @Override
    public void delete(Integer integer) {
        bookingTable.remove(integer);
    }

    @Override
    public Booking read(Integer integer) {
        Booking booking = bookingTable.get(integer);
        return booking;
    }

    @Override
    public Set<Booking> getAll() {
        return null;
    }
}
*/
