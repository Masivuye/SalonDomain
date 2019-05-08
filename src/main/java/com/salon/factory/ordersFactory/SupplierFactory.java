package com.salon.factory.ordersFactory;

import com.salon.domain.orders.Supplier;

public class SupplierFactory {
    public static Supplier getSupplier(String name , int num){
        return new Supplier.Builder().name("Shoprite")
                .supNum(2563)
                .build();
    }


}
