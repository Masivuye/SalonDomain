package com.salon.repositories.impl.manicureImpl;

import com.salon.domain.manicure.Manicure;
import com.salon.factory.manicureFactory.ManicureFactory;
import com.salon.repositories.manicureRepository.ManicureRepository;
import com.salon.repositories.manicureRepository.MassageRepository;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Optional;
import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ManicureRepositoryImplTest {

    String[] colors = {"blue,green"};
    String[] types = {"UpperMassage,FullMassage"};
    private ManicureRepository repository;
    private Manicure manicure;

    @Before
    public void setUp() throws Exception {
        //this.repository = ManicureRepositoryImpl.getRepository();
        this.manicure = ManicureFactory.getManicure(colors,types);
    }

    @Test
    public void getAll() {
        Set<Manicure> manicures = ((Set<Manicure>) this.repository);
    }

    @Test
    public void create() {
        Manicure created = this.repository.save(this.manicure);
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
        this.repository.save(updated);
        assertArrayEquals(types,updated.getTypes());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.deleteById(colors);
        getAll();
    }

    @Test
    public void read() {
        String[] colors = {"blue,green"};
        String[] types = {"UpperMassage,FullMassage"};
        System.out.println("In reading = "+manicure.getTypes());
        Optional<Manicure> read = this.repository.findById(colors);
        System.out.println("In read , read = "+read);
        getAll();
        assertNotEquals(manicure,read);
    }
}