package factory.staffFactoryTest;

import domain.staff.HairStyler;
import factory.staffFactory.HairStylerFactory;
import org.junit.Assert;
import org.junit.Test;


public class HairStylerFactoryTest {
    @Test
    public void getHairStyler() {
        String name = "Thandiswa";
        int num = 4562;
        HairStyler hairStyler = HairStylerFactory.getHairStyler(name,num);
        System.out.println(hairStyler);
        Assert.assertNotNull(hairStyler.toString());
    }
}
