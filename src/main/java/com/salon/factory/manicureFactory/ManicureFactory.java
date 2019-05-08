package com.salon.factory.manicureFactory;


import com.salon.domain.manicure.Manicure;

public class ManicureFactory {

    public static Manicure getManicure(String[] colors, String[] types){
        return new Manicure.Builder()
                .colors(colors)
                .types(types)
                .build();
    }
}
