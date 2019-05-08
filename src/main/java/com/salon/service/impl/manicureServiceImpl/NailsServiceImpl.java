package com.salon.service.impl.manicureServiceImpl;

import com.salon.domain.manicure.Nails;
import com.salon.repositories.manicureRepository.NailsRepository;
import com.salon.service.manicureService.NailsService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Service
public class NailsServiceImpl implements NailsService {

    private static NailsServiceImpl service = null;
    private Map<String[],Nails> nailsTable;

    private NailsServiceImpl() {
        nailsTable = new HashMap<>();

    }
    public static NailsService getService(){
        if(service == null) service = new NailsServiceImpl();
        return service;
    }

    @Override
    public Set<Nails> getAll() {
        return null;
    }

    @Override
    public Nails create(Nails nails) {
        nailsTable.put(nails.getColors(),nails);
        Nails nails1 = nailsTable.get(nails.getColors());
        return nails1;
    }

    @Override
    public Nails update(Nails nails) {
        nailsTable.put(nails.getColors(),nails);
        Nails nails1 = nailsTable.get(nails.getColors());
        return nails1;
    }

    @Override
    public void delete(String[] strings) {
        nailsTable.remove(strings);

    }

    @Override
    public Nails read(String[] strings) {
        Nails nails = nailsTable.get(strings);
        return nails;
    }
}
