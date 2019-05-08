package com.salon.repositories.impl.staffImpl;

import com.salon.domain.staff.Staff;
import com.salon.repositories.staffRepository.StaffRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StaffRepositoryImpl implements StaffRepository{

    private static StaffRepositoryImpl repository = null;
    private Map<String[], Staff> staffTable;

    private StaffRepositoryImpl() {
        staffTable = new HashMap<String[], Staff>();

    }
    public static StaffRepository getRepository(){
        if(repository == null) repository = new StaffRepositoryImpl();
        return repository;
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
