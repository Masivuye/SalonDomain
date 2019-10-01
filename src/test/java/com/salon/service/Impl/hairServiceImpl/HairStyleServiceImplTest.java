package com.salon.service.Impl.hairServiceImpl;

import com.salon.domain.hair.HairStyle;
import com.salon.factory.hairFactory.HairStyleFactory;
import com.salon.repositories.hairRepository.HairStyleRepository;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Optional;
import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HairStyleServiceImplTest {

    String[] types = {"Girls,Boys"};
    private HairStyleRepository repository;
    private HairStyle hairStyle;

    @Before
    public void setUp() throws Exception {
       // this.repository = (HairStyleRepositoryImpl) HairStyleRepositoryImpl.getRepository();
        this.hairStyle = HairStyleFactory.getHairStyle(types,200.00);
    }

    @Test
    public void getAll() {
        Set<HairStyle> hairStyles = (Set<HairStyle>) this.repository;
    }

    @Test
    public void create() {
        HairStyle created = this.repository.save(this.hairStyle);
        System.out.println("created = "+created);
        getAll();;
        assertEquals(created,this.hairStyle);
    }

    @Test
    public void update() {
        double price = 350.00;
        HairStyle updated = new HairStyle.Builder().types(types).price(price).build();
        System.out.println("to be updated = "+hairStyle.getPrice());
        this.repository.save(updated);
        System.out.println("updated = "+updated);
        assertEquals(price,updated.getPrice(),350.00);
        getAll();;
    }

    @Test
    public void delete() {
        this.repository.deleteById(types);
        getAll();
    }

    @Test
    public void read() {
        System.out.println("in reading = "+hairStyle.getTypes());
        Optional<HairStyle> read = this.repository.findById(types);
        System.out.println("In read = "+read);
        getAll();
        assertNotEquals(hairStyle,read);
    }
}