package com.salon.service.Impl.hairServiceImpl;

import com.salon.domain.hair.GirlsHair;
import com.salon.factory.hairFactory.GirlsHairFactory;
import com.salon.repositories.hairRepository.GirlsHairRepository;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Optional;
import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GirlsHairServiceImplTest {

    String[] types = {"Weave,Brading"};
    private GirlsHairRepository repository;
    private GirlsHair girlsHair;

    @Before
    public void setUp() throws Exception {
       // this.repository = (GirlsHairRepositoryImpl) GirlsHairRepositoryImpl.getRepository();
        this.girlsHair = GirlsHairFactory.getGirlsHair(types,150.00);
    }

    @Test
    public void getAll() {
        Set<GirlsHair> girlsHairs = (Set<GirlsHair>) this.repository;
    }

    @Test
    public void create() {
        GirlsHair created = this.repository.save(this.girlsHair);
        System.out.println("created = "+created);
        assertNotNull(created);
        assertSame(created,this.girlsHair);
    }

    @Test
    public void update() {
        String[] types = {"Condrows,Hair Relaxer"};
        GirlsHair updated = new GirlsHair.Builder().types(types).price(500.00).build();
        System.out.println("to be updated = "+girlsHair.getPrice());
        this.repository.save(updated);
        System.out.println("Updated = "+updated);
        assertEquals(500.00,updated.getPrice(),500.00);
        getAll();
    }

    @Test
    public void delete() {
        this.repository.deleteById(types);
        getAll();
    }

    @Test
    public void read() {
        System.out.println("in reading = "+girlsHair.getTypes());
        Optional<GirlsHair> read = this.repository.findById(types);
        System.out.println("in read , read = "+read);
        getAll();
        assertNotEquals(girlsHair,read);
    }
}