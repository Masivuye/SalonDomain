package com.salon.factory.hairFactory;

import com.salon.domain.hair.BoysCut;

public class BoysCutFactory {
    public static String[] types = {"Chis kop","English Cut"};

    public static BoysCut getBoysCut(String[] type, double price){
        return new BoysCut.Builder()
                .types(types)
                .price(25.00)
                .build();
    }

}
