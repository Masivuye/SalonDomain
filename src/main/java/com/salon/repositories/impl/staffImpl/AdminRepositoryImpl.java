package com.salon.repositories.impl.staffImpl;

import com.salon.domain.staff.Admin;
import com.salon.repositories.staffRepository.AdminRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Repository
public class AdminRepositoryImpl implements AdminRepository {

    private static AdminRepositoryImpl repository = null;
    private Map<Integer,Admin> adminTable;

    private AdminRepositoryImpl() { adminTable = new HashMap<>();

    }
    public static AdminRepository getRepository(){
        if(repository == null) repository = new AdminRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Admin> getAll() {
        return null;
    }

    @Override
    public Admin create(Admin admin) {
        adminTable.put(admin.getAdnum(),admin);
        Admin admin1 = adminTable.get(admin.getAdnum());
        return admin1;
    }

    @Override
    public Admin update(Admin admin) {
        adminTable.put(admin.getAdnum(),admin);
        Admin admin1 = adminTable.get(admin.getAdnum());
        return admin1;
    }

    @Override
    public void delete(Integer integer) {
        adminTable.remove(integer);

    }

    @Override
    public Admin read(Integer integer) {
        Admin admin = (Admin) getAll();
        return null;
    }
}
