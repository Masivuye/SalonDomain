package com.salon.repositories.ordersRepository;

import com.salon.domain.orders.LocalSuppliers;
import com.salon.repositories.IRepository.IRepository;

import java.util.Set;

public interface LocalSupplierRepository extends IRepository<LocalSuppliers,Integer> {
    Set<LocalSuppliers> getAll();
}
