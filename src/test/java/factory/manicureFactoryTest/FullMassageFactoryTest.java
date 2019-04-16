package factory.manicureFactoryTest;

import domain.manicure.FullMassage;
import factory.manicureFactory.FullMassageFactory;
import org.junit.Assert;
import org.junit.Test;

public class FullMassageFactoryTest {
    @Test
    public void getFullMassage(){
        double price = 250.00;
        FullMassage fullMassage = FullMassageFactory.getFullMassage(price);
        Assert.assertEquals(250.00,250.00,250.00);
        System.out.println(fullMassage.getPrice());
    }
}
