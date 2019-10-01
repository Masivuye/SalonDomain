package com.salon.service.Impl.bookingServiceImpl;

import com.salon.domain.booking.Booking;
import com.salon.repositories.bookingRepository.BookingRepository;
import com.salon.service.bookingService.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;
import java.util.Set;


@Service
public class BookingServiceImpl implements BookingService {

    private static BookingServiceImpl service = null;
    @Autowired
    private BookingRepository repository;

    private BookingServiceImpl() {

    }

    public static BookingServiceImpl getService(){
        if (service == null) service = new BookingServiceImpl();
        return service;
    }


    @Override
    public Set<Booking> getAll() {
        return (Set<Booking>) this.repository.findAll();

    }

    @Override
    public Booking create(Booking booking) {
        return this.repository.save(booking);
    }

    @Override
    public Booking update(Booking booking) {
        return this.repository.save(booking);
    }

    @Override
    public void delete(Integer integer) {
        this.repository.deleteById(integer);

    }

    @Override
    public Booking read(Integer s) {
        Optional<Booking> booking = this.repository.findById(s);
        return booking.orElse(null);
    }

}
