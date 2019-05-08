package com.salon.factory.hairFactoryTest;

import com.salon.domain.hair.GirlsHair;
import com.salon.factory.hairFactory.GirlsHairFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GirlsHairFactoryTest {
    @Test
    public void getGirlsHair(){
        double price = 200.00;
        String[] types = {"Bradding","Weave"};
        GirlsHair girlsHair = GirlsHairFactory.getGirlsHair(types,price);
        Assert.assertEquals(200.00,200.00,200.00);
        System.out.println(Arrays.toString(types)+price);
    }
}
