package com.salon.service.Impl.ordersServiceImpl;

import com.salon.domain.orders.LocalSuppliers;
import com.salon.repositories.ordersRepository.LocalSupplierRepository;
import com.salon.service.ordersService.LocalSupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
@Service
public class LocalSupplierServiceImpl implements LocalSupplierService {

    private static LocalSupplierServiceImpl service = null;
    @Autowired
    private LocalSupplierRepository localSupplierTable;

    private LocalSupplierServiceImpl() {


    }
    public static LocalSupplierService getService(){
        if(service == null) service = new LocalSupplierServiceImpl();
        return service;
    }

    @Override
    public Set<LocalSuppliers> getAll() {
        return (Set<LocalSuppliers>) this.localSupplierTable.findAll();
    }

    @Override
    public LocalSuppliers create(LocalSuppliers localSuppliers) {
        LocalSuppliers localSuppliers1 = localSupplierTable.save(localSuppliers) ;
        return localSuppliers1;
    }

    @Override
    public LocalSuppliers update(LocalSuppliers localSuppliers) {
        LocalSuppliers localSuppliers1 = localSupplierTable.save(localSuppliers) ;
        return localSuppliers1;
    }

    @Override
    public void delete(Integer integer) {
        localSupplierTable.deleteById(integer);

    }

    @Override
    public LocalSuppliers read(Integer s) {
        Optional<LocalSuppliers> localSuppliers = this.localSupplierTable.findById(s);
        return localSuppliers.orElse(null);
    }
}
