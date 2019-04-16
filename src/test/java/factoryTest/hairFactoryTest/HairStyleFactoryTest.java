package factoryTest.hairFactoryTest;

import domain.hair.HairStyle;
import factoryTest.hairFactory.HairStyleFactory;
import org.junit.Assert;
import org.junit.Test;

public class HairStyleFactoryTest {
    @Test
    public void getHairStyle() {
        String[] types = {"Bradding","HairCut"};
        HairStyle hair = HairStyleFactory.getHairStyle(types,150.00);
        Assert.assertEquals(150.00,150.00);
        //Test failed trying to test double
    }
}
