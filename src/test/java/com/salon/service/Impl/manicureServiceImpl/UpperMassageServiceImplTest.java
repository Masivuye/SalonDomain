package com.salon.service.Impl.manicureServiceImpl;


import com.salon.domain.manicure.UpperMassage;
import com.salon.factory.manicureFactory.FullMassageFactory;
import com.salon.factory.manicureFactory.UpperMassageFactory;
import com.salon.repositories.manicureRepository.UpperMassageRepository;
import com.salon.service.manicureService.UpperMassageService;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Optional;
import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UpperMassageServiceImplTest {

    private  UpperMassage upperMassage;
    private UpperMassageRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = (UpperMassageRepository) UpperMassageServiceImpl.getService();
        this.repository = (UpperMassageRepository) UpperMassageFactory.getUpperMassage(350.00);
    }

    @Test
    public void getAll() {
        Set<UpperMassage> upperMassages = ((Set<UpperMassage>) this.repository);
    }

    @Test
    public void create() {
        UpperMassage created = this.repository.save(upperMassage);
        System.out.println("created = "+created);
        getAll();
        assertEquals(created,this.upperMassage);
    }

    @Test
    public void update() {

        UpperMassage updated = new UpperMassage.Builder().price(500.00).build();
        System.out.println("to be updated = "+upperMassage);
        this.repository.save(updated);
        assertEquals(500.00,updated.getPrice(),500.00);
        getAll();
    }

    @Test
    public void delete() {
        this.repository.deleteById(0.0);
        getAll();
    }

    @Test
    public void read() {

        System.out.println("In reading = "+upperMassage.getPrice());
        Optional<UpperMassage> read = this.repository.findById(0.0);
        System.out.println("In read , read = "+read);
        getAll();
        assertNotEquals(upperMassage,read);
    }
}