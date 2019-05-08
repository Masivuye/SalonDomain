package com.salon.factory.manicureFactoryTest;

import com.salon.domain.manicure.Nails;
import com.salon.factory.manicureFactory.NailsFactory;
import org.junit.Test;

import java.util.Arrays;

public class NailsFactoryTest {
    @Test
    public void getNails(){
        String[]colors = {"pink","blue"};
        String[] shape = {"Oval","Square"};
        Nails nails = NailsFactory.getNails(colors,shape);
        System.out.println(Arrays.toString(colors)+Arrays.toString(shape));
    }

}
