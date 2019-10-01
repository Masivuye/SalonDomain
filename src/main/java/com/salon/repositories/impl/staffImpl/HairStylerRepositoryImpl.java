/*
package com.salon.repositories.impl.staffImpl;

import com.salon.domain.staff.HairStyler;
import com.salon.repositories.staffRepository.HairStylerRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Repository*/
/**//*
public class HairStylerRepositoryImpl implements HairStylerRepository {

    private static HairStylerRepositoryImpl repository = null;
    private Map<String,HairStyler> hairStylerTable;

    private HairStylerRepositoryImpl() {
        hairStylerTable = new HashMap<>();

    }
    public static HairStylerRepository getRepository(){
        if(repository == null) repository = new HairStylerRepositoryImpl();
        return repository;
    }

    @Override
    public Set<HairStyler> getAll() {
        return null;
    }

    @Override
    public HairStyler create(HairStyler hairStyler) {
        hairStylerTable.put(hairStyler.getName(),hairStyler);
        HairStyler hairStyler1 = hairStylerTable.get(hairStyler.getName());
        return hairStyler1;
    }

    @Override
    public HairStyler update(HairStyler hairStyler) {
        hairStylerTable.put(hairStyler.getName(),hairStyler);
        HairStyler hairStyler1 = hairStylerTable.get(hairStyler.getName());
        return hairStyler1;
    }

    @Override
    public void delete(String s) {
        hairStylerTable.remove(s);

    }

    @Override
    public HairStyler read(String s) {
        HairStyler hairStyler = hairStylerTable.get(s);
        return hairStyler;
    }
}
*/
