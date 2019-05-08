package com.salon.repositories.impl.orderImpl;

import com.salon.domain.orders.LocalSuppliers;
import com.salon.repositories.ordersRepository.LocalSupplierRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LocalSupplierRepositoryImpl implements LocalSupplierRepository {

    private static LocalSupplierRepositoryImpl repository = null;
    private Map<Integer,LocalSuppliers> localSupplierTable;

    private LocalSupplierRepositoryImpl() {
        localSupplierTable = new HashMap<>();

    }
    public static LocalSupplierRepository getRepository(){
        if(repository == null) repository = new LocalSupplierRepositoryImpl();
        return repository;
    }

    @Override
    public Set<LocalSuppliers> getAll() {
        return null;
    }

    @Override
    public LocalSuppliers create(LocalSuppliers localSuppliers) {
        localSupplierTable.put(localSuppliers.getLocSupNum(),localSuppliers);
        LocalSuppliers localSuppliers1 = localSupplierTable.get(localSuppliers.getLocSupNum()) ;
        return localSuppliers1;
    }

    @Override
    public LocalSuppliers update(LocalSuppliers localSuppliers) {
        localSupplierTable.put(localSuppliers.getLocSupNum(),localSuppliers);
        LocalSuppliers localSuppliers1 = localSupplierTable.get(localSuppliers.getLocSupNum()) ;
        return localSuppliers1;
    }

    @Override
    public void delete(Integer integer) {
        localSupplierTable.remove(integer);

    }

    @Override
    public LocalSuppliers read(Integer integer) {
        LocalSuppliers localSuppliers = localSupplierTable.get(integer);
        return localSuppliers;
    }
}
