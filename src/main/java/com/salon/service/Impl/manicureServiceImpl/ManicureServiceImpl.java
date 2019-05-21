package com.salon.service.Impl.manicureServiceImpl;

import com.salon.domain.manicure.Manicure;
import com.salon.service.manicureService.ManicureService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Service
public class ManicureServiceImpl implements ManicureService {

    private static ManicureServiceImpl service = null;
    private Map<String[],Manicure> manicureTable;

    private ManicureServiceImpl() {
        manicureTable = new HashMap<>();

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
        manicureTable.put(manicure.getTypes(),manicure);
        Manicure manicure1 = manicureTable.get(manicure.getTypes());
        return manicure1;
    }

    @Override
    public Manicure update(Manicure manicure) {
        manicureTable.put(manicure.getTypes(),manicure);
        Manicure manicure1 = manicureTable.get(manicure.getTypes());
        return manicure1;
    }

    @Override
    public void delete(String[] s) {
        manicureTable.remove(s);

    }

    @Override
    public Manicure read(String[] s) {
        Manicure manicure = manicureTable.get(s);
        return manicure;
    }
}
