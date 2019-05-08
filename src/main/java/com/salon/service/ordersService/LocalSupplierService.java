package com.salon.service.ordersService;

import com.salon.domain.orders.LocalSuppliers;
import com.salon.service.serviceInterface.ServiceInterface;

import java.util.Set;

public interface LocalSupplierService extends ServiceInterface<LocalSuppliers,Integer> {
    Set<LocalSuppliers> getAll();
}
