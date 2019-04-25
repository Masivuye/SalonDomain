package repositories.impl.orderImpl;

import domain.orders.ImportSupplier;
import repositories.ordersRepository.ImportSupplierRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ImportSupplierRepositoryImpl implements ImportSupplierRepository {

    private static ImportSupplierRepositoryImpl repository = null;
    private Map<String,ImportSupplier> importSupplierTable;

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
        importSupplierTable.put(importSupplier.getName(),importSupplier);
        ImportSupplier importSupplier1 = importSupplierTable.get(importSupplier.getName());
        return importSupplier1;
    }

    @Override
    public ImportSupplier update(ImportSupplier importSupplier) {
        importSupplierTable.put(importSupplier.getName(),importSupplier);
        ImportSupplier importSupplier1 = importSupplierTable.get(importSupplier.getName());
        return importSupplier1;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public ImportSupplier read(String s) {
        return null;
    }
}
