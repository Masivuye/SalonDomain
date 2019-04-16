package factory.bookingFactoryTest;

import domain.booking.Customer;
import factory.bookingFactory.CustomerFactory;
import org.junit.Assert;
import org.junit.Test;

public class CustomerFactoryTest {
    @Test
    public void getCustomer() {
       String name = "Masi Bheme";
        Customer customer = CustomerFactory.getCustomer(name,1245);
        Assert.assertEquals("Masivuye","Masi Bheme");
        System.out.print(name);

    }


}
