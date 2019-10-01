package com.salon.repositories.impl.manicureImpl;

import com.salon.domain.manicure.Massage;
import com.salon.factory.manicureFactory.MassageFactory;
import com.salon.repositories.manicureRepository.MassageRepository;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MassageRepositoryImplTest {
    String[] types = {"Upper,Full"};
    private MassageRepository repository;
    private Massage massage;

    @Before
    public void setUp() throws Exception {
        this.repository = MassageRepositoryImpl.getRepository();
        this.massage = MassageFactory.getMassage(types);
    }

    @Test
    public void getAll() {
        Set<Massage> massages = this.repository.getAll();
    }

    @Test
    public void create() {
        Massage created = this.repository.create(this.massage);
        System.out.println("reated = "+created);
        getAll();
        assertEquals(created,this.massage);
    }

    @Test
    public void update() {
        String[] types = {"Revlon,Relaxer lotion"};
        Massage updated = new Massage.Builder().types(types).build();
        System.out.println("to be updated = "+massage.getTypes());
        this.repository.update(updated);
        assertArrayEquals(types,updated.getTypes());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(massage.getTypes());
        getAll();
    }

    @Test
    public void read() {
        String[] products = {"Revlon,Relaxer lotion"};
        System.out.println("In reading = "+massage.getTypes());
        Massage read = this.repository.read(massage.getTypes());
        System.out.println("In read , read = "+read);
        getAll();
        assertNotEquals(massage,read);
    }
}