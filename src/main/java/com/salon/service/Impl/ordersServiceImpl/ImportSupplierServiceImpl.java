package com.salon.service.Impl.ordersServiceImpl;

import com.salon.domain.orders.ImportSupplier;
import com.salon.service.ordersService.ImportSupplierService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Service
public class ImportSupplierServiceImpl implements ImportSupplierService {

    private static ImportSupplierServiceImpl service = null;
    private Map<Integer,ImportSupplier> importSupplierTable;

    private ImportSupplierServiceImpl() {
        importSupplierTable = new HashMap<>();

    }
    public static ImportSupplierService getService(){
        if(service == null) service = new ImportSupplierServiceImpl();
        return service;
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
