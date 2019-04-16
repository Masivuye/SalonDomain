package factoryTest.staffFactoryTest;

import domain.staff.Admin;
import factoryTest.staffFactory.AdminFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdminFactoryTest {

    @Test
    public void getAmin() {
        String name = "Bulelwa";
        Admin admin = AdminFactory.getAmin(name,1203);
        Assert.assertEquals("Bulelwa",name);
        System.out.println(admin.getName());
    }
}