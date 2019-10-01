package com.salon.service.Impl.hairServiceImpl;

import com.salon.domain.hair.BoysCut;
import com.salon.repositories.hairRepository.BoysCutRepository;
import com.salon.service.hairService.BoysCutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
@Service
public class BoysCutServiceImpl implements BoysCutService {

    private static BoysCutServiceImpl service = null;
    @Autowired
    private BoysCutRepository boysCutTable;

    private BoysCutServiceImpl() {


    }
    public static BoysCutService getService(){
        if(service == null) service = new BoysCutServiceImpl();
        return service;
    }

    @Override
    public Set<BoysCut> getAll() {
        return (Set<BoysCut>) this.boysCutTable.findAll();
    }

    @Override
    public BoysCut create(BoysCut boysCut) {
        BoysCut boysCut1 = boysCutTable.save(boysCut);
        return boysCut1;
    }

    @Override
    public BoysCut update(BoysCut boysCut) {
        BoysCut boysCut1 = boysCutTable.save(boysCut);
        return boysCut1;
    }

    @Override
    public void delete(String[] s) {
        boysCutTable.deleteById(s);

    }

    @Override
    public BoysCut read(String[] s) {
        Optional<BoysCut> boysCut = this.boysCutTable.findById(s);
        return boysCut.orElse(null);
    }
}
