package com.salon.repositories.bookingRepository;

import com.salon.domain.booking.Booking;
import com.salon.repositories.IRepository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {

}
