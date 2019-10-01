package com.salon.service.Impl.staffServiceImpl;

import com.salon.domain.staff.HairStyler;
import com.salon.repositories.staffRepository.HairStylerRepository;
import com.salon.service.staffService.HairStylerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HairStylerServiceImpl implements HairStylerService {

    private static HairStylerServiceImpl service = null;
    @Autowired
    private HairStylerRepository hairStylerTable;

    private HairStylerServiceImpl(){

    }
    public static HairStylerService getService(){
        if(service == null) service = new HairStylerServiceImpl();
        return service;
    }

    @Override
    public List<HairStyler> getAll() {
        return  this.hairStylerTable.findAll();
    }

    @Override
    public HairStyler create(HairStyler hairStyler) {
        HairStyler hairStyler1 = hairStylerTable.save(hairStyler);
        return hairStyler1;
    }

    @Override
    public HairStyler update(HairStyler hairStyler) {
        HairStyler hairStyler1 = hairStylerTable.save(hairStyler);
        return hairStyler1;
    }

    @Override
    public void delete(String s) {
        hairStylerTable.deleteById(s);

    }

    @Override
    public HairStyler read(String s) {
        Optional<HairStyler> hairStyler = this.hairStylerTable.findById(s);
        return hairStyler.orElse(null);
    }
}
