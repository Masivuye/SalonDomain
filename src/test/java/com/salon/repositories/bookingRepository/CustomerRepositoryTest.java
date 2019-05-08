package com.salon.repositories.bookingRepository;

import com.salon.domain.booking.Customer;
import com.salon.factory.bookingFactory.CustomerFactory;
import org.junit.Before;
import org.junit.Test;
import com.salon.repositories.impl.bookingImpl.CustomerRepositoryImpl;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CustomerRepositoryTest {

    Map<String,Integer> values;
    CustomerRepository repository;

    @Before
    public void setUp() throws Exception {
        repository = CustomerRepositoryImpl.getRepository();
        values = new HashMap<String, Integer>();
        values.put("Vuvu",1);
        values.put("Masivuye",12);
        values.put("Bheme",13);
    }

    @Test
    public void create() throws Exception {
        Customer customer = CustomerFactory.getCustomer("Masi",211210471);
        repository.create(customer);
        assertEquals(211210471,customer.getCustNumber());
    }

    @Test()
    public void read() throws Exception {
        int custNumber = 211210471;
        Customer readCustomer = repository.read("Masi");
        assertEquals(custNumber,readCustomer.getCustNumber());
    }

    @Test()
    public void update() throws Exception {
        int custNumber = 211210471;
        Customer customer = repository.read("Masivuye");
        Customer newCustomer = new Customer.Builder().name("Masivuye")
                .custNumber(custNumber)
                .build();
        repository.update(newCustomer);
        Customer UpdateCustomer = repository.read("Masivuye");
        assertEquals("Masivuye",UpdateCustomer.getName());
    }

    @Test ()
    public void delete() throws Exception {
        repository.delete("Masi");
        Customer customer = repository.read("Masi");
        assertNull(customer);
    }
}