package com.salon.service.Impl.hairServiceImpl;

import com.salon.domain.hair.Promotions;
import com.salon.factory.hairFactory.PromotionsFactory;
import com.salon.repositories.hairRepository.PromotionsRepository;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Optional;
import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PromotionsServiceImplTest {

    String[] products = {"Revlon,Relaxer lotion"};
    private PromotionsRepository repository;
    private Promotions promotions;

    @Before
    public void setUp() throws Exception {
       // this.repository = (PromotionsRepositoryImpl) PromotionsRepositoryImpl.getRepository();
        this.promotions = PromotionsFactory.getPromotions(products);
    }

    @Test
    public void getAll() {
        Set<Promotions> promotions = (Set<Promotions>) this.repository;
    }

    @Test
    public void create() {
        Promotions created = this.repository.save(this.promotions);
        System.out.println("reated = "+created);
        getAll();
        assertEquals(created,this.promotions);
    }

    @Test
    public void update() {
        String[] products = {"Revlon,Relaxer lotion"};
        Promotions updated = new Promotions.Builder().types(products).build();
        System.out.println("to be updated = "+promotions.getProducts());
        this.repository.save(updated);
        assertArrayEquals(products,updated.getProducts());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.deleteById(products);
        getAll();
    }

    @Test
    public void read() {
        String[] products = {"Revlon,Relaxer lotion"};
        System.out.println("In reading = "+promotions.getProducts());
        Optional<Promotions> read = this.repository.findById(products);
        System.out.println("In read , read = "+read);
        getAll();
        assertNotEquals(promotions,read);
    }
}