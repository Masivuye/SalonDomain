package com.salon.service.bookingService;

import com.salon.domain.booking.Booking;
import com.salon.service.serviceInterface.ServiceInterface;

import java.util.Date;
import java.util.Set;

public interface BookingService extends ServiceInterface<Booking, Date> {
    Set<Booking> getAll();
}
