package com.salon.serviceImpl.ordersServiceImpl;

import com.salon.domain.orders.LocalSuppliers;
import com.salon.service.ordersService.LocalSupplierService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Service
public class LocalSupplierServiceImpl implements LocalSupplierService {

    private static LocalSupplierServiceImpl service = null;
    private Map<Integer,LocalSuppliers> localSupplierTable;

    private LocalSupplierServiceImpl() {
        localSupplierTable = new HashMap<>();

    }
    public static LocalSupplierService getService(){
        if(service == null) service = new LocalSupplierServiceImpl();
        return service;
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
