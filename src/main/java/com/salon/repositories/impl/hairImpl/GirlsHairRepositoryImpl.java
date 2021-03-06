/*
package com.salon.repositories.impl.hairImpl;


import com.salon.domain.hair.GirlsHair;
import com.salon.repositories.hairRepository.GirlsHairRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Repository
public class GirlsHairRepositoryImpl implements GirlsHairRepository {

    private static GirlsHairRepositoryImpl repository = null;
    private Map<String[],GirlsHair> girlsHairTable;

    private GirlsHairRepositoryImpl() {
        girlsHairTable = new HashMap<>();

    }
    public static GirlsHairRepository getRepository(){
        if(repository == null) repository = new GirlsHairRepositoryImpl();
        return repository;
    }

    @Override
    public Set<GirlsHair> getAll() {
        return null;
    }

    @Override
    public GirlsHair create(GirlsHair girlsHair) {
        girlsHairTable.put(girlsHair.getTypes(),girlsHair);
        GirlsHair girlsHair1 = girlsHairTable.get(girlsHair.getTypes());
        return girlsHair1;
    }

    @Override
    public GirlsHair update(GirlsHair girlsHair) {
        girlsHairTable.put(girlsHair.getTypes(),girlsHair);
        GirlsHair girlsHair1 = girlsHairTable.get(girlsHair.getTypes());
        return girlsHair1;
    }

    @Override
    public void delete(String[] s) {
        girlsHairTable.remove(s);

    }

    @Override
    public GirlsHair read(String[] s) {
        GirlsHair girlsHair = girlsHairTable.get(s);
        return girlsHair;
    }
}
*/
