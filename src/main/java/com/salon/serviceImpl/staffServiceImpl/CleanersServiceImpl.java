package com.salon.serviceImpl.staffServiceImpl;

import com.salon.domain.staff.Cleaners;
import com.salon.service.staffService.CleanersService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Service
public class CleanersServiceImpl implements CleanersService {

    private static CleanersServiceImpl service = null;
    private Map<String,Cleaners> cleanersTable;

    private CleanersServiceImpl() {
        cleanersTable = new HashMap<>();

    }
    public static CleanersService getService(){
        if(service == null) service = new CleanersServiceImpl();
        return service;
    }

    @Override
    public Set<Cleaners> getAll() {
        return null;
    }

    @Override
    public Cleaners create(Cleaners cleaners) {
        cleanersTable.put(cleaners.getName(),cleaners);
        Cleaners cleaners1 = cleanersTable.get(cleaners.getName());
        return cleaners1;
    }

    @Override
    public Cleaners update(Cleaners cleaners) {
        cleanersTable.put(cleaners.getName(),cleaners);
        Cleaners cleaners1 = cleanersTable.get(cleaners.getName());
        return cleaners1;
    }

    @Override
    public void delete(String s) {
        cleanersTable.remove(s);

    }

    @Override
    public Cleaners read(String s) {
        Cleaners cleaners = cleanersTable.get(s);
        return cleaners;
    }
}
