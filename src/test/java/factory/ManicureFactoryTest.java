package factory;

import domain.Manicure;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ManicureFactoryTest {

    @Test
    public void getManicure() {
        String[] colors = {"Red","Pink","Yellow"};
        String[] types = {"Nails","massage","Make-Up"};
        Manicure manicure = ManicureFactory.getManicure(colors,types);
        //Assert.assertArrayEquals(3,3);//I am trying to test my Arrays

    }
}