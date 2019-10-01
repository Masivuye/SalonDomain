package com.salon.service.Impl.hairServiceImpl;

import com.salon.domain.hair.HairStyle;
import com.salon.repositories.hairRepository.HairStyleRepository;
import com.salon.service.hairService.HairStyleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
@Service
public class HairStyleServiceImpl implements HairStyleService {

    private static HairStyleServiceImpl service = null;
    @Autowired
    private HairStyleRepository hairStyleTable;

    private HairStyleServiceImpl() {


    }
    public static HairStyleService getService(){
        if(service == null) service = new HairStyleServiceImpl();
        return service;
    }

    @Override
    public Set<HairStyle> getAll() {
        return (Set<HairStyle>) this.hairStyleTable.findAll();
    }

    @Override
    public HairStyle create(HairStyle hairStyle) {
        HairStyle hairStyle1 = hairStyleTable.save(hairStyle);
        return hairStyle1;

    }

    @Override
    public HairStyle update(HairStyle hairStyle) {
        HairStyle hairStyle1 = hairStyleTable.save(hairStyle);
        return hairStyle1;
    }

    @Override
    public void delete(String[] s) {
        hairStyleTable.deleteById(s);

    }

    @Override
    public HairStyle read(String[] s) {
        Optional<HairStyle> hairStyle = this.hairStyleTable.findById(s);
        return hairStyle.orElse(null);
    }
}
