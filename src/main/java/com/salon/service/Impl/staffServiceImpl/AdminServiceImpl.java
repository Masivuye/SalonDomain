package com.salon.service.Impl.staffServiceImpl;

import com.salon.domain.staff.Admin;
import com.salon.repositories.staffRepository.AdminRepository;
import com.salon.service.staffService.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
@Service
public class AdminServiceImpl implements AdminService {

    private static AdminServiceImpl service = null;
    @Autowired
    private AdminRepository adminTable;

    private AdminServiceImpl() {

    }
    public static AdminService getService(){
        if(service == null) service = new AdminServiceImpl();
        return service;
    }

    @Override
    public Set<Admin> getAll() {
        return (Set<Admin>) this.adminTable.findAll();
    }

    @Override
    public Admin create(Admin admin) {
        Admin admin1 = adminTable.save(admin);
        return admin1;
    }

    @Override
    public Admin update(Admin admin) {
        Admin admin1 = adminTable.save(admin);
        return admin1;
    }

    @Override
    public void delete(Integer integer) {
        adminTable.deleteById( integer);

    }

    @Override
    public Admin read(Integer s) {
        Optional<Admin> admin = this.adminTable.findById(s);
        return admin.orElse(null);
    }
}
