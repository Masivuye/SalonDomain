package factory.hairFactoryTest;

import domain.hair.HairStyle;
import factory.hairFactory.HairStyleFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class HairStyleFactoryTest {
    @Test
    public void getHairStyle() {
        String[] types = {"Bradding","HairCut"};
        double price = 150.00;
        HairStyle hair = HairStyleFactory.getHairStyle(types,price);
        Assert.assertEquals(150.00,150.00,150.00);
        System.out.println(Arrays.toString(types)+price);
    }
}
