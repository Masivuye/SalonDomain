package factory.staffFactoryTest;

import domain.staff.Staff;
import factory.staffFactory.StaffFactory;
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
