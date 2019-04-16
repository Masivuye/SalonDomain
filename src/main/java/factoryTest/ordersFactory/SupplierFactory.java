package factoryTest.ordersFactory;

import domain.orders.Supplier;

public class SupplierFactory {
    public static Supplier getSupplier(String name , int num){
        return new Supplier.Builder().name("Shoprite")
                .supNum(2563)
                .build();
    }


}
