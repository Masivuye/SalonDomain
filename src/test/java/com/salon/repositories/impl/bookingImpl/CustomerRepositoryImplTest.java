package com.salon.repositories.impl.bookingImpl;

import com.salon.domain.booking.Customer;
import com.salon.factory.bookingFactory.CustomerFactory;
import com.salon.repositories.bookingRepository.CustomerRepository;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class CustomerRepositoryImplTest {

    CustomerRepository repository;
    private Customer customer;

    @Before
    public void setUp() throws Exception {
        repository = CustomerRepositoryImpl.getRepository();
        this.customer = CustomerFactory.getCustomer("Masivuye",152);

    }

    @Test
    public void gettAll(){
        Set<Customer> customers = this.repository.getAll();
        System.out.println("getAll = "+customers);
    }

    @Test
    public void create() throws Exception {
        Customer customer = CustomerFactory.getCustomer("Masi",211210471);
        repository.create(customer);
        assertEquals(211210471,customer.getCustNumber());
    }

    @Test()
    public void read()  {

        Customer readCustomer = this.repository.read(customer.getName());
        System.out.println("In read = "+readCustomer);
        assertNotEquals(readCustomer,customer.getName());
    }

    @Test()
    public void update() throws Exception {
        int custNumber = 211;
        String name  = "Masivuye";
        Customer customers = new Customer.Builder().custNumber(custNumber).name(name).build();
        System.out.println("In update = "+customers);
        this.repository.update(customers);
        assertEquals(211,customers.getCustNumber());
        assertSame(name,customers.getName());

    }

    @Test ()
    public void delete() throws Exception {
        repository.delete("Masi");
        Customer customer = repository.read("Masi");
        assertNull(customer);
    }
}