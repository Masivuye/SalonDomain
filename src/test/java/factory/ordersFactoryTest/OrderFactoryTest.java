package factory.ordersFactoryTest;

import domain.orders.Order;
import factory.ordersFactory.OderFactory;
import org.junit.Assert;
import org.junit.Test;

public class OrderFactoryTest {

    @Test
    public void getOrder(){
        Order order = OderFactory.getOrders("Shampoo",59.99);
        Assert.assertEquals("Shampoo","Shampoo");
        System.out.println(order.getName());
    }
}
