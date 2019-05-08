package com.salon.factory.staffFactoryTest;

import com.salon.domain.staff.Admin;
import com.salon.factory.staffFactory.AdminFactory;
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