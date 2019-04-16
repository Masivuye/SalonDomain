package factory.ordersFactoryTest;

import domain.orders.Supplier;
import factory.ordersFactory.SupplierFactory;
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
