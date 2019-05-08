package com.salon.repositories.bookingRepository;

import com.salon.domain.booking.Customer;
import com.salon.repositories.IRepository.IRepository;

import java.util.*;

public interface CustomerRepository extends IRepository<Customer, String> {
    Set<Customer> getAll();

}
