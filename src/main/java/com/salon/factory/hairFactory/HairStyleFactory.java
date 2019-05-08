package com.salon.factory.hairFactory;

import com.salon.domain.hair.HairStyle;

public class HairStyleFactory {

    public static HairStyle getHairStyle(String[] types,double price){
        return new HairStyle.Builder().price(price)
                .types(types)
                .build();
    }

}
