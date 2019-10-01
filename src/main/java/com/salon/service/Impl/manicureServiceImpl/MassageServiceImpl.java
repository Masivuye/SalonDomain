package com.salon.service.Impl.manicureServiceImpl;

import com.salon.domain.manicure.Massage;
import com.salon.repositories.manicureRepository.MassageRepository;
import com.salon.service.manicureService.MassageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
@Service
public class MassageServiceImpl implements MassageService {

    private static MassageServiceImpl service = null;
    @Autowired
    private MassageRepository massageTable;

    private MassageServiceImpl() {

    }
    public static MassageService getService(){
        if(service == null) service = new MassageServiceImpl();
        return service;
    }

    @Override
    public Set<Massage> getAll() {
        return (Set<Massage>) this.massageTable.findAll();
    }

    @Override
    public Massage create(Massage massage) {
        Massage massage1 = massageTable.save(massage);
        return massage1;
    }

    @Override
    public Massage update(Massage massage) {
        Massage massage1 = massageTable.save(massage);
        return massage1;
    }

    @Override
    public void delete(String[] s) {
        massageTable.deleteById(s);

    }

    @Override
    public Massage read(String[] s) {
        Optional<Massage> optGender = this.massageTable.findById(s);
        return optGender.orElse(null);
    }
}
