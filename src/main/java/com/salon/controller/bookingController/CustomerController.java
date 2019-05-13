package com.salon.controller.bookingController;
import com.salon.domain.booking.Customer;
import com.salon.factory.bookingFactory.CustomerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.salon.service.impl.bookingServiceImpl.CustomerServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/salon/customer")
public class CustomerController {

    @Autowired
    private CustomerServiceImpl service;

    @GetMapping("/create{customerName}")
    public @ResponseBody
    Customer create(@PathVariable String customerName,int custNumber){
        Customer customer = CustomerFactory.getCustomer(customerName,custNumber);
        return  service.create(customer);

    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Customer> getAll(){
        return this.service.getAll();
    }
}
