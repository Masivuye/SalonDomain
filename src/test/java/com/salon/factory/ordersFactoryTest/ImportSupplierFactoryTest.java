package com.salon.factory.ordersFactoryTest;

import com.salon.domain.orders.ImportSupplier;
import com.salon.factory.ordersFactory.ImportSupplierFactory;
import org.junit.Assert;
import org.junit.Test;

public class ImportSupplierFactoryTest {
    @Test
    public void getImports(){
        ImportSupplier importSupplier = ImportSupplierFactory.getImports("Revlon",2548);
        Assert.assertEquals(2548,2548);
        System.out.println(importSupplier.getShipedNum());
    }
}
