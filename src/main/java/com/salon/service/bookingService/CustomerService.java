package com.salon.service.bookingService;

import com.salon.domain.booking.Customer;
import com.salon.service.serviceInterface.ServiceInterface;

import java.util.Set;

public interface CustomerService extends ServiceInterface<Customer ,String> {
    Set<Customer> getAll();
}
