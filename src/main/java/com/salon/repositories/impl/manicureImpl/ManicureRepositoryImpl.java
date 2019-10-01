/*
package com.salon.repositories.impl.manicureImpl;

import com.salon.domain.manicure.Manicure;
import com.salon.repositories.manicureRepository.ManicureRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Repository*/
/**//*
public class ManicureRepositoryImpl implements ManicureRepository {

    private static ManicureRepositoryImpl repository = null;
    private Map<String[],Manicure> manicureTable;

    private ManicureRepositoryImpl() {
        manicureTable = new HashMap<>();

    }
    public static ManicureRepository getRepository(){
        if(repository == null) repository = new ManicureRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Manicure> getAll() {
        return null;
    }

    @Override
    public Manicure create(Manicure manicure) {
        manicureTable.put(manicure.getTypes(),manicure);
        Manicure manicure1 = manicureTable.get(manicure.getTypes());
        return manicure1;
    }

    @Override
    public Manicure update(Manicure manicure) {
        manicureTable.put(manicure.getTypes(),manicure);
        Manicure manicure1 = manicureTable.get(manicure.getTypes());
        return manicure1;
    }

    @Override
    public void delete(String[] s) {
        manicureTable.remove(s);

    }

    @Override
    public Manicure read(String[] s) {
        Manicure manicure = manicureTable.get(s);
        return manicure;
    }
}
*/
