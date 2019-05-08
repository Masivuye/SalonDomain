package com.salon.factory.ordersFactoryTest;

import com.salon.domain.orders.Supplier;
import com.salon.factory.ordersFactory.SupplierFactory;
import org.junit.Assert;
import org.junit.Test;

public class SupplierFactoryTest {
    @Test
    public void getSupplier(){
        Supplier supplier = SupplierFactory.getSupplier("Shoprite",2563);
        Assert.assertEquals("Shoprite","Shoprite");
        System.out.println(supplier.getName());
    }
}
