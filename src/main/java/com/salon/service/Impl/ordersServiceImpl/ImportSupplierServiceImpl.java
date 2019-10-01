package com.salon.service.Impl.ordersServiceImpl;

import com.salon.domain.orders.ImportSupplier;
import com.salon.repositories.ordersRepository.ImportSupplierRepository;
import com.salon.service.ordersService.ImportSupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
@Service
public class ImportSupplierServiceImpl implements ImportSupplierService {

    private static ImportSupplierServiceImpl service = null;
    @Autowired
    private ImportSupplierRepository importSupplierTable;

    private ImportSupplierServiceImpl() {

    }
    public static ImportSupplierService getService(){
        if(service == null) service = new ImportSupplierServiceImpl();
        return service;
    }

    @Override
    public Set<ImportSupplier> getAll() {
        return (Set<ImportSupplier>) this.importSupplierTable.findAll();
    }

    @Override
    public ImportSupplier create(ImportSupplier importSupplier) {
        ImportSupplier importSupplier1 = importSupplierTable.save(importSupplier);
        return importSupplier1;
    }

    @Override
    public ImportSupplier update(ImportSupplier importSupplier) {
        ImportSupplier importSupplier1 = importSupplierTable.save(importSupplier);
        return importSupplier1;
    }

    @Override
    public void delete(Integer num) {
        importSupplierTable.deleteById(num);

    }

    @Override
    public ImportSupplier read(Integer s) {
        Optional<ImportSupplier> importSupplier = this.importSupplierTable.findById(s);
        return importSupplier.orElse(null);
    }
}
