package com.salon.service.impl;

import com.salon.domain.booking.Customer;
import com.salon.repositories.bookingRepository.CustomerRepository;
import com.salon.repositories.impl.bookingImpl.CustomerRepositoryImpl;
import com.salon.service.bookingService.CustomerService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class CustomerServiceImpl implements CustomerService {

    private static CustomerServiceImpl service = null;
    private CustomerRepository repository;

    private CustomerServiceImpl() {
        this.repository = CustomerRepositoryImpl.getRepository();
    }

    public static CustomerServiceImpl getService(){
        if (service == null) service = new CustomerServiceImpl();
        return service;
    }

    @Override
    public Set<Customer> getAll() {
        return this.repository.getAll() ;
    }

    @Override
    public Customer create(Customer customer) {
        return this.repository.create(customer);
    }

    @Override
    public Customer update(Customer customer) {
        return this.repository.update(customer);
    }

    @Override
    public void delete(String i) {
        this.repository.delete(i);

    }

    @Override
    public Customer read(String i) {
        return this.repository.read(i);
    }
}