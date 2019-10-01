package com.salon.service.Impl.manicureServiceImpl;

import com.salon.domain.manicure.Manicure;
import com.salon.repositories.manicureRepository.ManicureRepository;
import com.salon.service.manicureService.ManicureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
@Service
public class ManicureServiceImpl implements ManicureService {

    private static ManicureServiceImpl service = null;
    @Autowired
    private ManicureRepository manicureTable;

    private ManicureServiceImpl() {

    }
    public static ManicureService getService(){
        if(service == null) service = new ManicureServiceImpl();
        return service;
    }

    @Override
    public Set<Manicure> getAll() {
        return null;
    }

    @Override
    public Manicure create(Manicure manicure) {
        Manicure manicure1 = manicureTable.save(manicure);
        return manicure1;
    }

    @Override
    public Manicure update(Manicure manicure) {
        Manicure manicure1 = manicureTable.save(manicure);
        return manicure1;
    }

    @Override
    public void delete(String[] s) {
        manicureTable.deleteById(s);

    }

    @Override
    public Manicure read(String[] s) {
        Optional<Manicure> optGender = this.manicureTable.findById(s);
        return optGender.orElse(null);
    }
}
