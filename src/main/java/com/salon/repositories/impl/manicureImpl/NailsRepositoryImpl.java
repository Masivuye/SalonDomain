/*
package com.salon.repositories.impl.manicureImpl;

import com.salon.domain.manicure.Nails;
import com.salon.repositories.manicureRepository.NailsRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Repository*/
/**//*
public class NailsRepositoryImpl implements NailsRepository {

    private static NailsRepositoryImpl repository = null;
    private Map<String[],Nails> nailsTable;

    private NailsRepositoryImpl() {
        nailsTable = new HashMap<>();

    }
    public static NailsRepository getRepository(){
        if(repository == null) repository = new NailsRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Nails> getAll() {
        return null;
    }

    @Override
    public Nails create(Nails nails) {
        nailsTable.put(nails.getColors(),nails);
        Nails nails1 = nailsTable.get(nails.getColors());
        return nails1;
    }

    @Override
    public Nails update(Nails nails) {
        nailsTable.put(nails.getColors(),nails);
        Nails nails1 = nailsTable.get(nails.getColors());
        return nails1;
    }

    @Override
    public void delete(String[] strings) {
        nailsTable.remove(strings);

    }

    @Override
    public Nails read(String[] strings) {
        Nails nails = nailsTable.get(strings);
        return nails;
    }
}
*/
