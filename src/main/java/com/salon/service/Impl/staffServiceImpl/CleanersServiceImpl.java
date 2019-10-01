package com.salon.service.Impl.staffServiceImpl;

import com.salon.domain.staff.Cleaners;
import com.salon.repositories.staffRepository.CleanersRepository;
import com.salon.service.staffService.CleanersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
@Service
public class CleanersServiceImpl implements CleanersService {

    private static CleanersServiceImpl service = null;
    @Autowired
    private CleanersRepository cleanersTable;

    private CleanersServiceImpl() {

    }
    public static CleanersService getService(){
        if(service == null) service = new CleanersServiceImpl();
        return service;
    }

    @Override
    public Set<Cleaners> getAll() {
        return (Set<Cleaners>) this.cleanersTable.findAll();
    }

    @Override
    public Cleaners create(Cleaners cleaners) {
        Cleaners cleaners1 = cleanersTable.save(cleaners);
        return cleaners1;
    }

    @Override
    public Cleaners update(Cleaners cleaners) {
        Cleaners cleaners1 = cleanersTable.save(cleaners);
        return cleaners1;
    }

    @Override
    public void delete(String s) {
        cleanersTable.deleteById(s);

    }

    @Override
    public Cleaners read(String s) {
        Optional<Cleaners> cleaners = this.cleanersTable.findById(s);
        return cleaners.orElse(null);
    }
}
