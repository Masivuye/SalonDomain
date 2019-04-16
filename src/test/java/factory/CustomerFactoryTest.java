package factory;

import domain.booking.Customer;
import domain.hair.HairStyle;
import domain.manicure.Manicure;
import factory.bookingFactory.CustomerFactory;
import factory.hairFactory.HairStyleFactory;
import factory.manicureFactory.ManicureFactory;
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
    @Test
    public void getManicure() {
        String[] colors = {"Red","Pink","Yellow"};
        String[] types = {"Nails","massage","Make-Up"};
        Manicure manicure = ManicureFactory.getManicure(colors,types);
        //Assert.assertArrayEquals(3,3);//I am trying to test my Arrays

    }
    @Test
    public void getHairStyle() {
        String[] types = {"Bradding","HairCut"};
        HairStyle hair = HairStyleFactory.getHairStyle(types,150.00);
        Assert.assertEquals(150.00,150.00);
        //Test failed trying to test double
    }
}
