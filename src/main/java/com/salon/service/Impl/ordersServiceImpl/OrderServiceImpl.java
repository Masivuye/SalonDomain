package com.salon.service.Impl.ordersServiceImpl;

import com.salon.domain.orders.Order;
import com.salon.repositories.ordersRepository.OrderRepository;
import com.salon.service.ordersService.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
@Service
public class OrderServiceImpl implements OrderService {

    private static OrderServiceImpl service = null;
    @Autowired
    private OrderRepository orderTable;

    private OrderServiceImpl() {

    }
    public static OrderService getService(){
        if(service == null) service = new OrderServiceImpl();
        return service;
    }


    @Override
    public Set<Order> getAll() {
        return (Set<Order>) this.orderTable.findAll();
    }

    @Override
    public Order create(Order order) {
        Order order1 = orderTable.save(order);
        return order1;
    }

    @Override
    public Order update(Order order) {
        Order order1 = orderTable.save(order);
        return order1;
    }

    @Override
    public void delete(String s) {
        orderTable.deleteById(s);

    }

    @Override
    public Order read(String s) {
        Optional<Order> order = this.orderTable.findById(s);
        return order.orElse(null);
    }
}
