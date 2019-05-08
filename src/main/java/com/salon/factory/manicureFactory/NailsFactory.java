package com.salon.factory.manicureFactory;

import com.salon.domain.manicure.Nails;

public class NailsFactory {
    private static String[] shapes = {"Oval","Square"};
    public static Nails getNails(String[] colors,String[] shape){
        return new Nails.Builder()
                .colors(colors).shapes(shapes)
                .build();
    }
}
