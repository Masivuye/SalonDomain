package factory;

import domain.Staff;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StaffFactoryTest {

    @Test
    public void getStaff() {
        int staffNumber = 211210471;
        Staff staff = StaffFactory.getStaff("Masivuye",staffNumber);
        Assert.assertEquals(211210471,staffNumber);
        System.out.print(staff.getStaffNumber());
    }
}