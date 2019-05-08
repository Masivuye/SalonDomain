package com.salon.service.impl.ordersServiceImpl;

import com.salon.domain.orders.Supplier;
import com.salon.repositories.ordersRepository.SupplierRepository;
import com.salon.service.ordersService.SupplierService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Service
public class SupplierServiceImpl implements SupplierService {

    private static SupplierServiceImpl service = null;
    private Map<Integer,Supplier> supplierTable;

    private SupplierServiceImpl() {
        supplierTable = new HashMap<>();

    }
    public static SupplierService getService(){
        if(service == null) service = new SupplierServiceImpl();
        return service;
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
