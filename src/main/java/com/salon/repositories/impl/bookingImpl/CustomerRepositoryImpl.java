/*
package com.salon.repositories.impl.bookingImpl;


import com.salon.domain.booking.Customer;
import com.salon.repositories.bookingRepository.CustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

public class CustomerRepositoryImpl implements CustomerRepository {

    private static CustomerRepositoryImpl repository = null;
    private Map<String, Customer> customerTable;

    private CustomerRepositoryImpl() {
        customerTable = new HashMap<String, Customer>();

    }
    public static CustomerRepository getRepository(){
        if(repository == null) repository = new CustomerRepositoryImpl();
        return repository;
    }
    @Override
    public Customer create(Customer customer) {
        customerTable.put(customer.getName(),customer);
        Customer customer1 = customerTable.get(customer.getName());
        return customer1;
    }

    @Override
    public Customer update(Customer customer) {
        customerTable.put(customer.getName(),customer);
        Customer customer1 = customerTable.get(customer.getName());
        return customer1;
    }

    @Override
    public void delete(String s) {
        customerTable.remove(s);

    }

    @Override
    public Customer read(String s) {
        Customer customer = customerTable.get(s);
        return null;
    }
    @Override
    public Set<Customer> getAll() {
        return null;
    }
}
*/
