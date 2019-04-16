package factory.staffFactoryTest;

import domain.staff.Admin;
import factory.staffFactory.AdminFactory;
import org.junit.Assert;
import org.junit.Test;

public class AdminFactoryTest {

    @Test
    public void getAmin() {
        String name = "Bulelwa";
        Admin admin = AdminFactory.getAmin(name,1203);
        Assert.assertEquals("Bulelwa",name);
        System.out.println(admin.getName());
    }
}