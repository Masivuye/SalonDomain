package com.salon.repositories.impl.orderImpl;

import com.salon.domain.orders.ImportSupplier;
import com.salon.factory.ordersFactory.ImportSupplierFactory;
import com.salon.repositories.ordersRepository.ImportSupplierRepository;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ImportSupplierRepositoryImplTest {
    private ImportSupplierRepository repository;
    private ImportSupplier importSupplier;

    @Before
    public void setUp() throws Exception {
        this.repository = ImportSupplierRepositoryImpl.getRepository();
        this.importSupplier = ImportSupplierFactory.getImports("Shoprite",123);
    }

    @Test
    public void getAll() {
        Set<ImportSupplier> importSuppliers = this.repository.getAll();
    }

    @Test
    public void create() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void read() {
    }
}