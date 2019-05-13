package com.salon.repositories.impl.orderImpl;

import com.salon.domain.orders.ImportSupplier;
import com.salon.repositories.ordersRepository.ImportSupplierRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Repository
public class ImportSupplierRepositoryImpl implements ImportSupplierRepository {

    private static ImportSupplierRepositoryImpl repository = null;
    private Map<Integer,ImportSupplier> importSupplierTable;

    private ImportSupplierRepositoryImpl() {
        importSupplierTable = new HashMap<>();

    }
    public static ImportSupplierRepository getRepository(){
        if(repository == null) repository = new ImportSupplierRepositoryImpl();
        return repository;
    }

    @Override
    public Set<ImportSupplier> getAll() {
        return null;
    }

    @Override
    public ImportSupplier create(ImportSupplier importSupplier) {
        importSupplierTable.put(importSupplier.getShipedNum(),importSupplier);
        ImportSupplier importSupplier1 = importSupplierTable.get(importSupplier.getShipedNum());
        return importSupplier1;
    }

    @Override
    public ImportSupplier update(ImportSupplier importSupplier) {
        importSupplierTable.put(importSupplier.getShipedNum(),importSupplier);
        ImportSupplier importSupplier1 = importSupplierTable.get(importSupplier.getShipedNum());
        return importSupplier1;
    }

    @Override
    public void delete(Integer num) {
        importSupplierTable.remove(num);

    }

    @Override
    public ImportSupplier read(Integer num) {
        ImportSupplier importSupplier = importSupplierTable.get(num);
        return importSupplier;
    }
}
