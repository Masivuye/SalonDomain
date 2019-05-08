package com.salon.service.ordersService;

import com.salon.domain.orders.Supplier;
import com.salon.service.serviceInterface.ServiceInterface;

import java.util.Set;

public interface SupplierService extends ServiceInterface<Supplier,Integer> {
    Set<Supplier> getAll();
}
