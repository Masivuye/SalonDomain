package com.salon.controller.ordersController;

import com.salon.domain.orders.Order;
import com.salon.factory.ordersFactory.OderFactory;
import com.salon.serviceImpl.ordersServiceImpl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/salon/Order")
public class OderController {

    @Autowired
    private OrderServiceImpl orderService;


    @GetMapping("/create{name}")
    public @ResponseBody
    Order create(@PathVariable String name,double price){
        Order order = OderFactory.getOrders(name,price);
        return orderService.create(order);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Order> getAll(){
        return  orderService.getAll();
    }
}
