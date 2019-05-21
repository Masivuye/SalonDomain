package com.salon.service.Impl.ordersServiceImpl;

import com.salon.domain.orders.Order;
import com.salon.service.ordersService.OrderService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Service
public class OrderServiceImpl implements OrderService {

    private static OrderServiceImpl service = null;
    private Map<String,Order> orderTable;

    private OrderServiceImpl() {
        orderTable = new HashMap<>();

    }
    public static OrderService getService(){
        if(service == null) service = new OrderServiceImpl();
        return service;
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
