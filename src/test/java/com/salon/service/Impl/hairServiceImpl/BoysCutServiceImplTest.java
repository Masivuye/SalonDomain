package com.salon.service.Impl.hairServiceImpl;

import com.salon.domain.hair.BoysCut;
import com.salon.factory.hairFactory.BoysCutFactory;
import com.salon.repositories.hairRepository.BoysCutRepository;
import com.salon.repositories.impl.hairImpl.BoysCutRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class BoysCutServiceImplTest {

    private BoysCutRepositoryImpl repository;
    private BoysCut boysCut;
    private String[] types = {"Chiskop,English Cut"};


    @Before
    public void setUp() throws Exception {

        this.repository = (BoysCutRepositoryImpl) BoysCutRepositoryImpl.getRepository();
        this.boysCut = BoysCutFactory.getBoysCut(types,40.00);
    }

    @Test
    public void getAll() {
        Set<BoysCut> boysCuts = this.repository.getAll();
    }

    @Test
    public void create() {
        BoysCut created = this.repository.create(this.boysCut);
        System.out.println("created "+created);
        assertNotNull(created);
        assertSame(created,this.boysCut);
    }

    @Test
    public void update() {
        double price = 60.00;
        String[] types = {"Plein Cut,English Cut"};
        BoysCut updated = new BoysCut.Builder().types(types).price(price).build();
        System.out.println("to be updated = "+boysCut.getPrice() );
        this.repository.update(updated);
        System.out.println("updated = "+updated);
        //assertEquals();
        assertEquals(price,updated.getPrice(),price);
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(boysCut.getTypes());
        getAll();
    }

    @Test
    public void read() {
        System.out.println("In read = "+boysCut.getTypes());
        BoysCut read = this.repository.read(boysCut.getTypes());
        System.out.println("in read = "+read);
        getAll();
        assertNotEquals(boysCut,read);
    }
}