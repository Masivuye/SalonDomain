package com.salon.service.ordersService;

import com.salon.domain.orders.Order;
import com.salon.service.serviceInterface.ServiceInterface;

import java.util.Set;

public interface OrderService extends ServiceInterface<Order,String> {
    Set<Order> getAll();
}
