/*
package com.salon.repositories.impl.orderImpl;

import com.salon.domain.orders.Supplier;
import com.salon.repositories.ordersRepository.SupplierRepository;
import org.springframework.stereotype.Repository;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Repository*/
/**//*
public class SupplierRepositoryImpl implements SupplierRepository {

    private static SupplierRepositoryImpl repository = null;
    private Map<Integer,Supplier> supplierTable;

    private SupplierRepositoryImpl() {
        supplierTable = new HashMap<>();

    }
    public static SupplierRepository getRepository(){
        if(repository == null) repository = new SupplierRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Supplier> getAll() {
        return null;
    }

    @Override
    public Supplier create(Supplier supplier) {
        supplierTable.put(supplier.getSupNum(),supplier);
        Supplier supplier1 = supplierTable.get(supplier.getSupNum());
        return supplier1;
    }

    @Override
    public Supplier update(Supplier supplier) {
        supplierTable.put(supplier.getSupNum(),supplier);
        Supplier supplier1 = supplierTable.get(supplier.getSupNum());
        return supplier1;
    }

    @Override
    public void delete(Integer s) {
        supplierTable.remove(s);

    }

    @Override
    public Supplier read(Integer s) {
        Supplier supplier = supplierTable.get(s);
        return supplier;
    }
}
*/
