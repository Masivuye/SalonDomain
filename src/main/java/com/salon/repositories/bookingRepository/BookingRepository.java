package com.salon.repositories.bookingRepository;

import com.salon.domain.booking.Booking;
import com.salon.repositories.IRepository.IRepository;

import java.util.*;


public interface BookingRepository extends IRepository<Booking, Integer> {
        Set<Booking> getAll();
}
