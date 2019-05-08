package com.salon.repositories.ordersRepository;

import com.salon.domain.orders.Supplier;
import com.salon.repositories.IRepository.IRepository;

import java.util.Set;

public interface SupplierRepository extends IRepository<Supplier,Integer> {
    Set<Supplier> getAll();
}
