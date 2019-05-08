package com.salon.factory.bookingFactoryTest;

import com.salon.domain.booking.Customer;
import com.salon.factory.bookingFactory.CustomerFactory;
import org.junit.Assert;
import org.junit.Test;

public class CustomerFactoryTest {
    @Test
    public void getCustomer() {
       String name = "Masi Bheme";
        Customer customer = CustomerFactory.getCustomer(name,1245);
        Assert.assertEquals("Masi Bheme","Masi Bheme");
        System.out.print(name);

    }


}
