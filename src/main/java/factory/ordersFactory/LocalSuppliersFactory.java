package factory.ordersFactory;

import domain.orders.LocalSuppliers;

public class LocalSuppliersFactory {
    public static LocalSuppliers getLocal(String name,int num){
        return new LocalSuppliers.Builder().locSupNum(78456)
                .name("Restore").build();
    }
}
