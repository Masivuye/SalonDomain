package com.salon.repositories.impl.manicureImpl;

import com.salon.domain.manicure.UpperMassage;
import com.salon.factory.manicureFactory.UpperMassageFactory;
import com.salon.repositories.manicureRepository.UpperMassageRepository;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;
import java.util.Set;

import static org.junit.Assert.*;

public class UpperMassageRepositoryImplTest {

    private UpperMassageRepository repository;
    private UpperMassage upperMassage;

    @Before
    public void setUp() throws Exception {

        this.upperMassage = UpperMassageFactory.getUpperMassage(350.00);
    }

    @Test
    public void getAll() {
        Set<UpperMassage> upperMassages = (Set<UpperMassage>) this.repository;
    }

    @Test
    public void create() {
        UpperMassage created = this.repository.save(this.upperMassage);
        System.out.println("created = "+created);
        getAll();
        assertEquals(created,this.upperMassage);
    }

    @Test
    public void update() {

        UpperMassage updated = new UpperMassage.Builder().price(500.00).build();
        System.out.println("to be updated = "+upperMassage.getPrice());
        this.repository.save(updated);
        assertEquals(500.00,updated.getPrice(),500.00);
        getAll();
    }

    @Test
    public void delete() {
        this.repository.deleteById(350.00);
        getAll();
    }

    @Test
    public void read() {

        System.out.println("In reading = "+upperMassage.getPrice());
        Optional<UpperMassage> read = this.repository.findById(350.00);
        System.out.println("In read , read = "+read);
        getAll();
        assertNotEquals(upperMassage,read);
    }
}