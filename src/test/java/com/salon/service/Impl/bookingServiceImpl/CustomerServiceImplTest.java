package com.salon.service.Impl.bookingServiceImpl;

import com.salon.domain.booking.Customer;
import com.salon.factory.bookingFactory.CustomerFactory;

import com.salon.repositories.bookingRepository.CustomerRepository;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Optional;
import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CustomerServiceImplTest {

    private CustomerRepository repository;
    private Customer customer;

    @Before
    public void setUp() throws Exception {
        //this.repository = (CustomerRepositoryImpl) CustomerRepositoryImpl.getRepository();
        this.customer = CustomerFactory.getCustomer("Masivuye",12);
    }

    @Test
    public void getAll() {
        Set<Customer> customers = (Set<Customer>) this.repository;
    }

    @Test
    public void create() {
        Customer created = this.repository.save(this.customer);
        System.out.println("created = "+created);
        assertNotNull(created);
        assertSame(created,this.customer);
    }

    @Test
    public void update() {
        String name = "Thandiswa";
        Customer updated = new Customer.Builder().custNumber(547).name(name).build();
        System.out.println(" to be updated "+customer.getName());
        this.repository.save(updated);
        System.out.println("updated "+updated);
        assertEquals(name,updated.getName());


    }

    @Test
    public void delete() {
        this.repository.deleteById(" ");
        getAll();
    }

    @Test
    public void read() {
        System.out.println("In read " +customer.getName());
        Optional<Customer> read = this.repository.findById(" ");
        System.out.println("In read , read "+read);
        getAll();
        assertNotEquals(customer,read);
    }
}