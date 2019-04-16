package factory.manicureFactoryTest;

import domain.manicure.Massage;
import factory.manicureFactory.MassageFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MassageFactoryTest {
    @Test
    public void getMassage(){
        String[] types = {"Full","UpperBody"};
        Massage massage = MassageFactory.getMassage(types);
        //Assert.assertArrayEquals();
        System.out.println(Arrays.toString(types));
    }
}
