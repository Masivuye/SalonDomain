package com.salon.factory.manicureFactoryTest;

import com.salon.domain.manicure.UpperMassage;
import com.salon.factory.manicureFactory.UpperMassageFactory;
import org.junit.Assert;
import org.junit.Test;

public class UpperMassageFactoryTest {
    @Test
    public void getUpperMassage(){
        double price = 150.00;
        UpperMassage upperMassage = UpperMassageFactory.getUpperMassage(price);
        Assert.assertEquals(150.00,150.00,150.00);
        System.out.println(upperMassage.getPrice());
    }
}
