package com.salon.service.Impl.manicureServiceImpl;

import com.salon.domain.manicure.Nails;
import com.salon.factory.manicureFactory.NailsFactory;
import com.salon.repositories.impl.manicureImpl.NailsRepositoryImpl;
import com.salon.repositories.manicureRepository.NailsRepository;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NailsServiceImplTest {

    String[] colors = {"blue,green"};
    String[] shapes = {"Square,Round"};
    private NailsRepositoryImpl repository;
    private Nails nails;

    @Before
    public void setUp() throws Exception {
        this.repository = (NailsRepositoryImpl) NailsRepositoryImpl.getRepository();
        this.nails = NailsFactory.getNails(colors,shapes);
    }

    @Test
    public void getAll() {
        Set<Nails> nails = this.repository.getAll();
    }

    @Test
    public void create() {
        Nails created = this.repository.create(this.nails);
        System.out.println("reated = "+created);
        getAll();
        assertEquals(created,this.nails);
    }

    @Test
    public void update() {
        String[] colors = {"blue,green"};
        String[] types = {"UpperMassage,FullMassage"};
        Nails updated = new Nails.Builder().colors(colors).build();
        System.out.println("to be updated = "+nails.getColors());
        this.repository.update(updated);
        assertArrayEquals(colors,updated.getColors());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(nails.getColors());
        getAll();
    }

    @Test
    public void read() {
        String[] colors = {"blue,green"};
        String[] types = {"UpperMassage,FullMassage"};
        System.out.println("In reading = "+nails.getColors());
        Nails read = this.repository.read(nails.getColors());
        System.out.println("In read , read = "+read);
        getAll();
        assertNotEquals(nails,read);
    }
}