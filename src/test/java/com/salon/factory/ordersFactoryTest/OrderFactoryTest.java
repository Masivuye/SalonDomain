package com.salon.factory.ordersFactoryTest;

import com.salon.domain.orders.Order;
import com.salon.factory.ordersFactory.OderFactory;
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
