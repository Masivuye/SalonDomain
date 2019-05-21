package com.salon.service.Impl.manicureServiceImpl;

import com.salon.domain.manicure.FullMassage;
import com.salon.service.manicureService.FullMassageService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Service
public class FullMassageServiceImpl implements FullMassageService {

    private static FullMassageServiceImpl service = null;
    private Map<Double,FullMassage> fullMassageTable;

    private FullMassageServiceImpl() {
        fullMassageTable = new HashMap<>();

    }
    public static FullMassageService getService(){
        if(service == null) service = new FullMassageServiceImpl();
        return service;
    }
    @Override
    public Set<FullMassage> getAll() {
        return null;
    }

    @Override
    public FullMassage create(FullMassage fullMassage) {
        fullMassageTable.put(fullMassage.getPrice(),fullMassage);
        FullMassage fullMassage1 = fullMassageTable.get(fullMassage.getPrice());
        return fullMassage1;
    }

    @Override
    public FullMassage update(FullMassage fullMassage) {
        fullMassageTable.put(fullMassage.getPrice(),fullMassage);
        FullMassage fullMassage1 = fullMassageTable.get(fullMassage.getPrice());
        return fullMassage1;
    }

    @Override
    public void delete(Double aDouble) {
        fullMassageTable.remove(aDouble);

    }

    @Override
    public FullMassage read(Double aDouble) {
        FullMassage fullMassage = fullMassageTable.get(aDouble);
        return fullMassage;
    }


}
