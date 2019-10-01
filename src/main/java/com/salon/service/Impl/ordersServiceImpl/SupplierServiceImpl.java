package com.salon.service.Impl.ordersServiceImpl;

import com.salon.domain.orders.Supplier;
import com.salon.repositories.ordersRepository.SupplierRepository;
import com.salon.service.ordersService.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
@Service
public class SupplierServiceImpl implements SupplierService {

    private static SupplierServiceImpl service = null;
    @Autowired
    private SupplierRepository supplierTable;

    private SupplierServiceImpl() {
    }
    public static SupplierService getService(){
        if(service == null) service = new SupplierServiceImpl();
        return service;
    }

    @Override
    public Set<Supplier> getAll() {
        return (Set<Supplier>) this.supplierTable.findAll();
    }

    @Override
    public Supplier create(Supplier supplier) {
        Supplier supplier1 = supplierTable.save(supplier);
        return supplier1;
    }

    @Override
    public Supplier update(Supplier supplier) {
        Supplier supplier1 = supplierTable.save(supplier);
        return supplier1;
    }

    @Override
    public void delete(Integer s) {
        supplierTable.deleteById(s);

    }

    @Override
    public Supplier read(Integer s) {
        Optional<Supplier> supplier = this.supplierTable.findById(s);
        return supplier.orElse(null);
    }
}
