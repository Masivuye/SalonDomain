package com.salon.factory.hairFactory;

import com.salon.domain.hair.GirlsHair;

public class GirlsHairFactory {
    public static String[] types = {"Braiding","Weave"};

    public static GirlsHair getGirlsHair(String[] type,double price){
        return new GirlsHair.Builder()
                .types(types)
                .price(200.00)
                .build();
    }
}
