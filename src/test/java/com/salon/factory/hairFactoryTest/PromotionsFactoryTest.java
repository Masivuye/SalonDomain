package com.salon.factory.hairFactoryTest;

import com.salon.domain.hair.Promotions;
import com.salon.factory.hairFactory.PromotionsFactory;
import org.junit.Test;

import java.util.Arrays;

public class PromotionsFactoryTest {

    @Test
    public void getPromotions(){
        String[] products = {"Relaxer","Shampoo"};
        Promotions promotions = PromotionsFactory.getPromotions(products);
        //Assert.assertArrayEquals(2,2); testing array Equality
        System.out.println(Arrays.toString(products));
    }
}
