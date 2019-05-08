package com.salon.factory.manicureFactoryTest;


import com.salon.domain.manicure.Manicure;
import com.salon.factory.manicureFactory.ManicureFactory;
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
