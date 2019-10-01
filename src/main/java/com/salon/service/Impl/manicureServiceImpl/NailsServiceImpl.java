package com.salon.service.Impl.manicureServiceImpl;

import com.salon.domain.manicure.Nails;
import com.salon.repositories.manicureRepository.NailsRepository;
import com.salon.service.manicureService.NailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
@Service
public class NailsServiceImpl implements NailsService {

    private static NailsServiceImpl service = null;
    @Autowired
    private NailsRepository nailsTable;

    private NailsServiceImpl() {


    }
    public static NailsService getService(){
        if(service == null) service = new NailsServiceImpl();
        return service;
    }

    @Override
    public Set<Nails> getAll() {
        return (Set<Nails>) this.nailsTable.findAll();
    }

    @Override
    public Nails create(Nails nails) {
        Nails nails1 = nailsTable.save(nails);
        return nails1;
    }

    @Override
    public Nails update(Nails nails) {
        Nails nails1 = nailsTable.save(nails);
        return nails1;
    }

    @Override
    public void delete(String[] strings) {
        nailsTable.deleteById(strings);

    }

    @Override
    public Nails read(String[] s) {
        Optional<Nails> nails = this.nailsTable.findById(s);
        return nails.orElse(null);
    }
}
