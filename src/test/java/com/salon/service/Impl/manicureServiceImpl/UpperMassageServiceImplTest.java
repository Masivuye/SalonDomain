package com.salon.service.Impl.manicureServiceImpl;


import com.salon.domain.manicure.UpperMassage;
import com.salon.factory.manicureFactory.FullMassageFactory;
import com.salon.factory.manicureFactory.UpperMassageFactory;
import com.salon.repositories.impl.manicureImpl.FullMassageRepositoryImpl;
import com.salon.repositories.impl.manicureImpl.UpperMassageRepositoryImpl;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UpperMassageServiceImplTest {

    private UpperMassageRepositoryImpl repository;
    private UpperMassage upperMassage;

    @Before
    public void setUp() throws Exception {
        this.repository = (UpperMassageRepositoryImpl) UpperMassageRepositoryImpl.getRepository();
        this.upperMassage = UpperMassageFactory.getUpperMassage(350.00);
    }

    @Test
    public void getAll() {
        Set<UpperMassage> upperMassages = this.repository.getAll();
    }

    @Test
    public void create() {
        UpperMassage created = this.repository.create(this.upperMassage);
        System.out.println("created = "+created);
        getAll();
        assertEquals(created,this.upperMassage);
    }

    @Test
    public void update() {

        UpperMassage updated = new UpperMassage.Builder().price(500.00).build();
        System.out.println("to be updated = "+upperMassage.getPrice());
        this.repository.update(updated);
        assertEquals(500.00,updated.getPrice(),500.00);
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(upperMassage.getPrice());
        getAll();
    }

    @Test
    public void read() {

        System.out.println("In reading = "+upperMassage.getPrice());
        UpperMassage read = this.repository.read(upperMassage.getPrice());
        System.out.println("In read , read = "+read);
        getAll();
        assertNotEquals(upperMassage,read);
    }
}