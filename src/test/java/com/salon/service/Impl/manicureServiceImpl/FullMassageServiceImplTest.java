package com.salon.service.Impl.manicureServiceImpl;

import com.salon.domain.manicure.FullMassage;
import com.salon.factory.manicureFactory.FullMassageFactory;
import com.salon.repositories.manicureRepository.FullMassageRepository;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Optional;
import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FullMassageServiceImplTest {


        private FullMassageRepository repository;
        private FullMassage fullMassage;

        @Before
        public void setUp() throws Exception {
           // this.repository = (FullMassageRepositoryImpl) FullMassageRepositoryImpl.getRepository();
            this.fullMassage = FullMassageFactory.getFullMassage(350.00);
        }

        @Test
        public void getAll() {
            Set<FullMassage> fullMassages = (Set<FullMassage>) this.repository;
        }

        @Test
        public void create() {
            FullMassage created = this.repository.save(this.fullMassage);
            System.out.println("created = "+created);
            getAll();
            assertEquals(created,this.fullMassage);
        }

        @Test
        public void update() {

            FullMassage updated = new FullMassage.Builder().price(500.00).build();
            System.out.println("to be updated = "+fullMassage.getPrice());
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

            System.out.println("In reading = "+fullMassage.getPrice());
            Optional<FullMassage> read = this.repository.findById(0.0);
            System.out.println("In read , read = "+read);
            getAll();
            assertNotEquals(fullMassage,read);
        }
}