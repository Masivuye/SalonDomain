package com.salon.service.Impl.manicureServiceImpl;

import com.salon.domain.manicure.Manicure;
import com.salon.factory.manicureFactory.ManicureFactory;
import com.salon.repositories.impl.manicureImpl.ManicureRepositoryImpl;
import com.salon.repositories.manicureRepository.ManicureRepository;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ManicureServiceImplTest {

    String[] colors = {"blue,green"};
    String[] types = {"UpperMassage,FullMassage"};
    private ManicureRepositoryImpl repository;
    private Manicure manicure;

    @Before
    public void setUp() throws Exception {
        this.repository = (ManicureRepositoryImpl) ManicureRepositoryImpl.getRepository();
        this.manicure = ManicureFactory.getManicure(colors,types);
    }

    @Test
    public void getAll() {
        Set<Manicure> manicures = this.repository.getAll();
    }

    @Test
    public void create() {
        Manicure created = this.repository.create(this.manicure);
        System.out.println("reated = "+created);
        getAll();
        assertEquals(created,this.manicure);
    }

    @Test
    public void update() {
        String[] colors = {"blue,green"};
        String[] types = {"UpperMassage,FullMassage"};
        Manicure updated = new Manicure.Builder().types(types).build();
        System.out.println("to be updated = "+manicure.getTypes());
        this.repository.update(updated);
        assertArrayEquals(types,updated.getTypes());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(manicure.getTypes());
        getAll();
    }

    @Test
    public void read() {
        String[] colors = {"blue,green"};
        String[] types = {"UpperMassage,FullMassage"};
        System.out.println("In reading = "+manicure.getTypes());
        Manicure read = this.repository.read(manicure.getTypes());
        System.out.println("In read , read = "+read);
        getAll();
        assertNotEquals(manicure,read);
    }
}