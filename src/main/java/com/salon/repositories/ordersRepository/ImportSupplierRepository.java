package com.salon.repositories.ordersRepository;

import com.salon.domain.orders.ImportSupplier;
import com.salon.repositories.IRepository.IRepository;

import java.util.Set;

public interface ImportSupplierRepository extends IRepository<ImportSupplier,Integer> {
    Set<ImportSupplier> getAll();
}
