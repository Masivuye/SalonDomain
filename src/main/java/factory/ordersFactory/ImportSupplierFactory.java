package factory.ordersFactory;

import domain.orders.ImportSupplier;

public class ImportSupplierFactory {
    public static ImportSupplier getImports(String name,int num){
        return new ImportSupplier.Builder().shipedNum(2548)
                .name("Revlon")
                .build();
    }
}
