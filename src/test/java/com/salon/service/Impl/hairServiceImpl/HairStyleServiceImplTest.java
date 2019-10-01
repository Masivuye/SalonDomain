package com.salon.service.Impl.hairServiceImpl;

import com.salon.domain.hair.HairStyle;
import com.salon.factory.hairFactory.HairStyleFactory;
import com.salon.factory.staffFactory.HairStylerFactory;
import com.salon.repositories.impl.hairImpl.HairStyleRepositoryImpl;
import com.salon.service.hairService.HairStyleService;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HairStyleServiceImplTest {

    String[] types = {"Girls,Boys"};
    private HairStyleRepositoryImpl repository;
    private HairStyle hairStyle;

    @Before
    public void setUp() throws Exception {
        this.repository = (HairStyleRepositoryImpl) HairStyleRepositoryImpl.getRepository();
        this.hairStyle = HairStyleFactory.getHairStyle(types,200.00);
    }

    @Test
    public void getAll() {
        Set<HairStyle> hairStyles = this.repository.getAll();
    }

    @Test
    public void create() {
        HairStyle created = this.repository.create(this.hairStyle);
        System.out.println("created = "+created);
        getAll();;
        assertEquals(created,this.hairStyle);
    }

    @Test
    public void update() {
        double price = 350.00;
        HairStyle updated = new HairStyle.Builder().types(types).price(price).build();
        System.out.println("to be updated = "+hairStyle.getPrice());
        this.repository.update(updated);
        System.out.println("updated = "+updated);
        assertEquals(price,updated.getPrice(),350.00);
        getAll();;
    }

    @Test
    public void delete() {
        this.repository.delete(hairStyle.getTypes());
        getAll();
    }

    @Test
    public void read() {
        System.out.println("in reading = "+hairStyle.getTypes());
        HairStyle read = this.repository.read(hairStyle.getTypes());
        System.out.println("In read = "+read);
        getAll();
        assertNotEquals(hairStyle,read);
    }
}