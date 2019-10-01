package com.salon.service.Impl.manicureServiceImpl;

import com.salon.domain.manicure.UpperMassage;
import com.salon.repositories.manicureRepository.UpperMassageRepository;
import com.salon.service.manicureService.UpperMassageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
@Service
public class UpperMassageServiceImpl implements UpperMassageService {

    private static UpperMassageServiceImpl service = null;
    @Autowired
    private UpperMassageRepository upperMassageTable;

    private UpperMassageServiceImpl() {
    }
    public static UpperMassageService getService(){
        if(service == null) service = new UpperMassageServiceImpl();
        return service;
    }

    @Override
    public Set<UpperMassage> getAll() {
        return (Set<UpperMassage>) this.upperMassageTable.findAll();
    }

    @Override
    public UpperMassage create(UpperMassage upperMassage) {
        UpperMassage upperMassage1 = upperMassageTable.save(upperMassage);
        return upperMassage1;
    }

    @Override
    public UpperMassage update(UpperMassage upperMassage) {
        UpperMassage upperMassage1 = upperMassageTable.save(upperMassage);
        return upperMassage1;
    }

    @Override
    public void delete(Double aDouble) {
        upperMassageTable.deleteById(aDouble);

    }

    @Override
    public UpperMassage read(Double s) {
        Optional<UpperMassage> upperMassage = this.upperMassageTable.findById(s);
        return upperMassage.orElse(null);
    }


}
