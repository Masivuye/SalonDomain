package com.salon.service.Impl.bookingServiceImpl;

import com.salon.domain.booking.Customer;
import com.salon.repositories.bookingRepository.CustomerRepository;
import com.salon.service.bookingService.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;
@Service
public class CustomerServiceImpl implements CustomerService {

    private static CustomerServiceImpl service = null;
    @Autowired
    private CustomerRepository repository;

    private CustomerServiceImpl() {

    }

    public static CustomerServiceImpl getService(){
        if (service == null) service = new CustomerServiceImpl();
        return service;
    }

    @Override
    public Set<Customer> getAll() {
        return (Set<Customer>) this.repository.findAll();
    }

    @Override
    public Customer create(Customer customer) {
        return this.repository.save(customer);
    }

    @Override
    public Customer update(Customer customer) {
        return this.repository.save(customer);
    }

    @Override
    public void delete(String i) {
        this.repository.deleteById(i);

    }

    @Override
    public Customer read(String s) {
        Optional<Customer> customer = this.repository.findById(s);
        return customer.orElse(null);
    }
}
