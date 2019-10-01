/*
package com.salon.repositories.impl.orderImpl;

import com.salon.domain.orders.Order;
import com.salon.repositories.ordersRepository.OrderRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Repository*/
/**//*
public class OrderRepositoryImpl implements OrderRepository {

    private static OrderRepositoryImpl repository = null;
    private Map<String,Order> orderTable;

    private OrderRepositoryImpl() {
        orderTable = new HashMap<>();

    }
    public static OrderRepository getRepository(){
        if(repository == null) repository = new OrderRepositoryImpl();
        return repository;
    }


    @Override
    public Set<Order> getAll() {
        return null;
    }

    @Override
    public Order create(Order order) {
        orderTable.put(order.getName(),order);
        Order order1 = orderTable.get(order.getName());
        return order1;
    }

    @Override
    public Order update(Order order) {
        orderTable.put(order.getName(),order);
        Order order1 = orderTable.get(order.getName());
        return order1;
    }

    @Override
    public void delete(String s) {
        orderTable.remove(s);

    }

    @Override
    public Order read(String s) {
        Order order = orderTable.get(s);
        return order;
    }
}
*/
