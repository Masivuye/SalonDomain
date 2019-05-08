package com.salon.service.impl.hairServiceImpl;

import com.salon.domain.hair.BoysCut;
import com.salon.repositories.hairRepository.BoysCutRepository;
import com.salon.service.hairService.BoysCutService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Service
public class BoysCutServiceImpl implements BoysCutService {

    private static BoysCutServiceImpl service = null;
    private Map<String[], BoysCut> boysCutTable;

    private BoysCutServiceImpl() {
        boysCutTable = new HashMap<String[], BoysCut>();

    }
    public static BoysCutService getService(){
        if(service == null) service = new BoysCutServiceImpl();
        return service;
    }

    @Override
    public Set<BoysCut> getAll() {
        return null;
    }

    @Override
    public BoysCut create(BoysCut boysCut) {
        boysCutTable.put(boysCut.getTypes(),boysCut);
        BoysCut boysCut1 = boysCutTable.get(boysCut.getTypes());
        return boysCut1;
    }

    @Override
    public BoysCut update(BoysCut boysCut) {
        boysCutTable.put(boysCut.getTypes(),boysCut);
        BoysCut boysCut1 = boysCutTable.get(boysCut.getTypes());
        return boysCut1;
    }

    @Override
    public void delete(String[] s) {
        boysCutTable.remove(s);

    }

    @Override
    public BoysCut read(String[] s) {
        BoysCut boysCut = boysCutTable.get(s);
        return boysCut;
    }
}
