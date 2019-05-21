package com.salon.service.Impl.staffServiceImpl;

import com.salon.domain.staff.Admin;
import com.salon.service.staffService.AdminService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Service
public class AdminServiceImpl implements AdminService {

    private static AdminServiceImpl service = null;
    private Map<Integer,Admin> adminTable;

    private AdminServiceImpl() { adminTable = new HashMap<>();

    }
    public static AdminService getService(){
        if(service == null) service = new AdminServiceImpl();
        return service;
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
