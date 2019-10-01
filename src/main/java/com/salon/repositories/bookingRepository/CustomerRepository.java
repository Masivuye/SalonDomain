package com.salon.repositories.bookingRepository;

import com.salon.domain.booking.Customer;
import com.salon.repositories.IRepository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {

}
