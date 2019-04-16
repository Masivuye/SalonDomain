package factory.manicureFactoryTest;


import domain.manicure.Manicure;
import factory.manicureFactory.ManicureFactory;
import org.junit.Test;

public class ManicureFactoryTest {
    @Test
    public void getManicure() {
        String[] colors = {"Red","Pink","Yellow"};
        String[] types = {"Nails","massage","Make-Up"};
        Manicure manicure = ManicureFactory.getManicure(colors,types);
        //Assert.assertArrayEquals();//I am trying to test my Arrays

    }
}
