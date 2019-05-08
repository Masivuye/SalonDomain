package com.salon.service.impl.manicureServiceImpl;

import com.salon.domain.manicure.Massage;
import com.salon.repositories.manicureRepository.MassageRepository;
import com.salon.service.manicureService.MassageService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Service
public class MassageServiceImpl implements MassageService {

    private static MassageServiceImpl service = null;
    private Map<String[],Massage> massageTable;

    private MassageServiceImpl() {
        massageTable = new HashMap<>();

    }
    public static MassageService getService(){
        if(service == null) service = new MassageServiceImpl();
        return service;
    }

    @Override
    public Set<Massage> getAll() {
        return null;
    }

    @Override
    public Massage create(Massage massage) {
        massageTable.put(massage.getTypes(),massage);
        Massage massage1 = massageTable.get(massage.getTypes());
        return massage1;
    }

    @Override
    public Massage update(Massage massage) {
        massageTable.put(massage.getTypes(),massage);
        Massage massage1 = massageTable.get(massage.getTypes());
        return massage1;
    }

    @Override
    public void delete(String[] s) {
        massageTable.remove(s);

    }

    @Override
    public Massage read(String[] s) {
        Massage massage = massageTable.get(s);
        return massage;
    }
}
