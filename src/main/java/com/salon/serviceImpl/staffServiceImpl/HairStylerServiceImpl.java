package com.salon.serviceImpl.staffServiceImpl;

import com.salon.domain.staff.HairStyler;
import com.salon.service.staffService.HairStylerService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Service
public class HairStylerServiceImpl implements HairStylerService {

    private static HairStylerServiceImpl service = null;
    private Map<String,HairStyler> hairStylerTable;

    private HairStylerServiceImpl() {
        hairStylerTable = new HashMap<>();

    }
    public static HairStylerService getService(){
        if(service == null) service = new HairStylerServiceImpl();
        return service;
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
