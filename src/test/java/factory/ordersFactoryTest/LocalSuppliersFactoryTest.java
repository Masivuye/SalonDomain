package factory.ordersFactoryTest;

import domain.orders.LocalSuppliers;
import factory.ordersFactory.LocalSuppliersFactory;
import org.junit.Assert;
import org.junit.Test;

public class LocalSuppliersFactoryTest {
    @Test
    public void getLocal(){
        LocalSuppliers localSuppliers = LocalSuppliersFactory.getLocal("Restore",78456);
        Assert.assertEquals(78456,78456);
        System.out.println(localSuppliers.getLocSupNum());
    }
}
