package factory;

import domain.HairStyle;

public class HairStyleFactory {

    public static HairStyle getHairStyle(String[] types,double price){
        return new HairStyle.Builder().price(price)
                .types(types)
                .build();
    }

}
