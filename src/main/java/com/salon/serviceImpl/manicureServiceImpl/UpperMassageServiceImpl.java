package com.salon.serviceImpl.manicureServiceImpl;

import com.salon.domain.manicure.UpperMassage;
import com.salon.service.manicureService.UpperMassageService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Service
public class UpperMassageServiceImpl implements UpperMassageService {

    private static UpperMassageServiceImpl service = null;
    private Map<Double,UpperMassage> upperMassageTable;

    private UpperMassageServiceImpl() {
        upperMassageTable = new HashMap<>();

    }
    public static UpperMassageService getService(){
        if(service == null) service = new UpperMassageServiceImpl();
        return service;
    }

    @Override
    public Set<UpperMassage> getAll() {
        return null;
    }

    @Override
    public UpperMassage create(UpperMassage upperMassage) {
        upperMassageTable.put(upperMassage.getPrice(),upperMassage);
        UpperMassage upperMassage1 = upperMassageTable.get(upperMassage.getPrice());
        return upperMassage1;
    }

    @Override
    public UpperMassage update(UpperMassage upperMassage) {
        upperMassageTable.put(upperMassage.getPrice(),upperMassage);
        UpperMassage upperMassage1 = upperMassageTable.get(upperMassage.getPrice());
        return upperMassage1;
    }

    @Override
    public void delete(Double aDouble) {
        upperMassageTable.remove(aDouble);

    }

    @Override
    public UpperMassage read(Double aDouble) {
        UpperMassage upperMassage = upperMassageTable.get(aDouble);
        return upperMassage;
    }


}
