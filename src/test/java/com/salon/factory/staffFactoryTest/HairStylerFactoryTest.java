package com.salon.factory.staffFactoryTest;

import com.salon.domain.staff.HairStyler;
import com.salon.factory.staffFactory.HairStylerFactory;
import org.junit.Assert;
import org.junit.Test;


public class HairStylerFactoryTest {
    @Test
    public void getHairStyler() {
        String name = "Thandiswa";
        int num = 4562;
        HairStyler hairStyler = HairStylerFactory.getHairStyler(name,num);
        System.out.println(hairStyler);
        Assert.assertNotNull(hairStyler.toString());
    }
}
