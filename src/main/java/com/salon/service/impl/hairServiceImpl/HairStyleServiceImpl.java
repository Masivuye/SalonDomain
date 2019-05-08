package com.salon.service.impl.hairServiceImpl;

import com.salon.domain.hair.HairStyle;
import com.salon.repositories.hairRepository.HairStyleRepository;
import com.salon.service.hairService.HairStyleService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Service
public class HairStyleServiceImpl implements HairStyleService {

    private static HairStyleServiceImpl service = null;
    private Map<String[],HairStyle > hairStyleTable;

    private HairStyleServiceImpl() {
        hairStyleTable = new HashMap<>();

    }
    public static HairStyleService getService(){
        if(service == null) service = new HairStyleServiceImpl();
        return service;
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
