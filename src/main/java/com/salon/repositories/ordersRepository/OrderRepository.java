package com.salon.repositories.ordersRepository;

import com.salon.domain.orders.Order;
import com.salon.repositories.IRepository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface OrderRepository extends JpaRepository<Order,String> {

}
