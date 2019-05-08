package com.salon.factory.ordersFactory;

import com.salon.domain.orders.ImportSupplier;

public class ImportSupplierFactory {
    public static ImportSupplier getImports(String name,int num){
        return new ImportSupplier.Builder().shipedNum(2548)
                .name("Revlon")
                .build();
    }
}
