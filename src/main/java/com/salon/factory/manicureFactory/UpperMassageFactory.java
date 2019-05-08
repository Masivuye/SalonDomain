package com.salon.factory.manicureFactory;

import com.salon.domain.manicure.UpperMassage;

public class UpperMassageFactory {

    public static UpperMassage getUpperMassage(double price){
        return new UpperMassage.Builder()
                .price(150.00).build();
    }
}
