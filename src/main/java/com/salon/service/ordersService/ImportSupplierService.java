package com.salon.service.ordersService;

import com.salon.domain.orders.ImportSupplier;
import com.salon.service.serviceInterface.ServiceInterface;

import java.util.Set;

public interface ImportSupplierService extends ServiceInterface<ImportSupplier,Integer> {
    Set<ImportSupplier> getAll();
}
