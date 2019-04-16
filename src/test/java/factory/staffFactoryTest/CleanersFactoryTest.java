package factory.staffFactoryTest;

import domain.staff.Cleaners;
import factory.staffFactory.CleanersFactory;
import org.junit.Assert;
import org.junit.Test;

public class CleanersFactoryTest {

    @Test
    public void getCleaners(){
        String name = "Zoe";
        Cleaners cleaners =  CleanersFactory.getCleaners(name,2136);
        Assert.assertEquals("Zoe",name);
        System.out.println(name);
    }
}
