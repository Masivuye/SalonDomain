package com.salon.service.Impl.hairServiceImpl;


import com.salon.domain.hair.GirlsHair;
import com.salon.repositories.hairRepository.GirlsHairRepository;
import com.salon.service.hairService.GirlsHairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
@Service
public class GirlsHairServiceImpl implements GirlsHairService {

    private static GirlsHairServiceImpl service = null;
    @Autowired
    private GirlsHairRepository girlsHairTable;

    private GirlsHairServiceImpl() {


    }
    public static GirlsHairService getService(){
        if(service == null) service = new GirlsHairServiceImpl();
        return service;
    }

    @Override
    public Set<GirlsHair> getAll() {
        return (Set<GirlsHair>) this.girlsHairTable.findAll();
    }

    @Override
    public GirlsHair create(GirlsHair girlsHair) {

        GirlsHair girlsHair1 = girlsHairTable.save(girlsHair);
        return girlsHair1;
    }

    @Override
    public GirlsHair update(GirlsHair girlsHair) {

        GirlsHair girlsHair1 = girlsHairTable.save(girlsHair);
        return girlsHair1;
    }

    @Override
    public void delete(String[] s) {
        girlsHairTable.deleteById(s);

    }

    @Override
    public GirlsHair read(String[] s) {
        Optional<GirlsHair> girlsHair = this.girlsHairTable.findById(s);
        return girlsHair.orElse(null);
    }
}
