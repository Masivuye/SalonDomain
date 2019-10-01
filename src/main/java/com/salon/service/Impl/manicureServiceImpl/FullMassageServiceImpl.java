package com.salon.service.Impl.manicureServiceImpl;

import com.salon.domain.manicure.FullMassage;
import com.salon.repositories.manicureRepository.FullMassageRepository;
import com.salon.service.manicureService.FullMassageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
@Service
public class FullMassageServiceImpl implements FullMassageService {

    private static FullMassageServiceImpl service = null;
    @Autowired
    private FullMassageRepository fullMassageTable;

    private FullMassageServiceImpl() {

    }
    public static FullMassageService getService(){
        if(service == null) service = new FullMassageServiceImpl();
        return service;
    }
    @Override
    public Set<FullMassage> getAll() {
        return (Set<FullMassage>) this.fullMassageTable.findAll();
    }

    @Override
    public FullMassage create(FullMassage fullMassage) {
        FullMassage fullMassage1 = fullMassageTable.save(fullMassage);
        return fullMassage1;
    }

    @Override
    public FullMassage update(FullMassage fullMassage) {
        FullMassage fullMassage1 = fullMassageTable.save(fullMassage);
        return fullMassage1;
    }

    @Override
    public void delete(Double aDouble) {
        fullMassageTable.deleteById(aDouble);

    }

    @Override
    public FullMassage read(Double s) {
        Optional<FullMassage> fullMassage= this.fullMassageTable.findById(s);
        return fullMassage.orElse(null);
    }


}
