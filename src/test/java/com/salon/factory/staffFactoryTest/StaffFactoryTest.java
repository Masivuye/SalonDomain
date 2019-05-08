package com.salon.factory.staffFactoryTest;

import com.salon.domain.staff.Staff;
import com.salon.factory.staffFactory.StaffFactory;
import org.junit.Assert;
import org.junit.Test;

public class StaffFactoryTest {
    @Test
    public void getStaff() {
        int staffNumber = 211210471;
        String[] names = {"Masivuye","Thandie"};
        Staff staff = StaffFactory.getStaff(names,staffNumber);
        Assert.assertEquals(211210471,staffNumber);
        System.out.print(staff.getStaffNumber());
    }
}
