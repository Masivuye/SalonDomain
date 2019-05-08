package com.salon.service.impl.hairServiceImpl;


import com.salon.domain.hair.GirlsHair;
import com.salon.repositories.hairRepository.GirlsHairRepository;
import com.salon.service.hairService.GirlsHairService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Service
public class GirlsHairServiceImpl implements GirlsHairService {

    private static GirlsHairServiceImpl service = null;
    private Map<String[],GirlsHair> girlsHairTable;

    private GirlsHairServiceImpl() {
        girlsHairTable = new HashMap<>();

    }
    public static GirlsHairService getService(){
        if(service == null) service = new GirlsHairServiceImpl();
        return service;
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
