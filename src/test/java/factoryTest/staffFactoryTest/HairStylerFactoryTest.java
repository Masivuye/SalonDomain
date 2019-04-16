package factoryTest.staffFactoryTest;

import domain.staff.HairStyler;
import factoryTest.staffFactory.HairStylerFactory;
import org.junit.Assert;
import org.junit.Test;


public class HairStylerFactoryTest {
    @Test
    public void getHairStyler() {
        int num = 4562;
        HairStyler hairStyler = HairStylerFactory.getHairStyler(" ", num);
        Assert.assertNull(num);
        System.out.println(hairStyler.getStylnum());
    }
}
