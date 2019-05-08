package com.salon.repositories.ordersRepository;

import com.salon.domain.orders.Order;
import com.salon.repositories.IRepository.IRepository;

import java.util.Set;

public interface OrderRepository extends IRepository<Order,String> {
    Set<Order> getAll();
}
