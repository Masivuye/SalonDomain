package factory.hairFactoryTest;

import domain.hair.BoysCut;
import factory.hairFactory.BoysCutFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class BoysCutFactoryTest {

    @Test
    public void getBoysCut(){
        String[] types = {"English Cut","Chis kop"};
        double price = 25.00;
        BoysCut boysCut = BoysCutFactory.getBoysCut(types,price);
        Assert.assertEquals(25.00,25.00,25.00);
        System.out.println(Arrays.toString(types)+price);
    }
}
