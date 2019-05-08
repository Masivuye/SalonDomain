package com.salon.service.impl;

import com.salon.domain.booking.Booking;
import com.salon.repositories.bookingRepository.BookingRepository;
import com.salon.repositories.impl.bookingImpl.BookingRepositoryImpl;
import com.salon.service.bookingService.BookingService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Set;


@Service
public class BookingServiceImpl implements BookingService {

    private static BookingServiceImpl service = null;
    private BookingRepository repository;

    private BookingServiceImpl() {
        this.repository = BookingRepositoryImpl.getRepository();
    }

    public static BookingServiceImpl getService(){
        if (service == null) service = new BookingServiceImpl();
        return service;
    }


    @Override
    public Set<Booking> getAll() {
        return this.repository.getAll();

    }

    @Override
    public Booking create(Booking booking) {
        return this.repository.create(booking);
    }

    @Override
    public Booking update(Booking booking) {
        return this.repository.update(booking);
    }

    @Override
    public void delete(Date date) {
        this.repository.delete(date);

    }

    @Override
    public Booking read(Date date) {
        return this.repository.read(date);
    }
}
