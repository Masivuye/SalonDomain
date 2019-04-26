package repositories.impl.orderImpl;

import domain.orders.Supplier;
import repositories.ordersRepository.SupplierRepository;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

    }

    @Override
    public Supplier read(Integer s) {
        return null;
    }
}
