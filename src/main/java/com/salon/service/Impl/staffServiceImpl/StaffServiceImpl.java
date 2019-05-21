package com.salon.service.Impl.staffServiceImpl;

import com.salon.domain.staff.Staff;
import com.salon.service.staffService.StaffService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Service
public class StaffServiceImpl implements StaffService {

    private static StaffServiceImpl service = null;
    private Map<String[], Staff> staffTable;

    private StaffServiceImpl() {
        staffTable = new HashMap<String[], Staff>();

    }
    public static StaffService getService(){
        if(service == null) service = new StaffServiceImpl();
        return service;
    }

    @Override
    public Set<Staff> getAll() {
        return null;
    }

    @Override
    public Staff create(Staff staff) {
        staffTable.put(staff.getName(),staff);
        Staff staff1 = staffTable.get(staff.getName());
        return staff1;
    }

    @Override
    public Staff update(Staff staff) {
        staffTable.put(staff.getName(),staff);
        Staff staff1 = staffTable.get(staff.getName());
        return staff1;
    }

    @Override
    public void delete(String[] s) {
        staffTable.remove(s);

    }

    @Override
    public Staff read(String[] s) {
        Staff staff = (Staff) getAll();

        return staff;
    }
}
