package com.salon.repositories.impl.hairImpl;

import com.salon.domain.hair.HairStyle;
import com.salon.repositories.hairRepository.HairStyleRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Repository
public class HairStyleRepositoryImpl implements HairStyleRepository {

    private static HairStyleRepositoryImpl repository = null;
    private Map<String[],HairStyle > hairStyleTable;

    private HairStyleRepositoryImpl() {
        hairStyleTable = new HashMap<>();

    }
    public static HairStyleRepository getRepository(){
        if(repository == null) repository = new HairStyleRepositoryImpl();
        return repository;
    }

    @Override
    public Set<HairStyle> getAll() {
        return null;
    }

    @Override
    public HairStyle create(HairStyle hairStyle) {
        hairStyleTable.put(hairStyle.getTypes(),hairStyle);
        HairStyle hairStyle1 = hairStyleTable.get(hairStyle.getTypes());
        return hairStyle1;

    }

    @Override
    public HairStyle update(HairStyle hairStyle) {
        hairStyleTable.put(hairStyle.getTypes(),hairStyle);
        HairStyle hairStyle1 = hairStyleTable.get(hairStyle.getTypes());
        return hairStyle1;
    }

    @Override
    public void delete(String[] s) {
        hairStyleTable.remove(s);

    }

    @Override
    public HairStyle read(String[] s) {
        HairStyle hairStyle = hairStyleTable.get(s);
        return hairStyle;
    }
}
