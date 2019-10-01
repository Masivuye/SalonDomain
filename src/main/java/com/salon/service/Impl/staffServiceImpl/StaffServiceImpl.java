package com.salon.service.Impl.staffServiceImpl;

import com.salon.domain.staff.Staff;
import com.salon.repositories.staffRepository.StaffRepository;
import com.salon.service.staffService.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
@Service
public class StaffServiceImpl implements StaffService {

    private static StaffServiceImpl service = null;
    @Autowired
    private StaffRepository staffTable;

    private StaffServiceImpl() {

    }
    public static StaffService getService(){
        if(service == null) service = new StaffServiceImpl();
        return service;
    }

    @Override
    public Set<Staff> getAll() {
        return (Set<Staff>) this.staffTable.findAll();
    }

    @Override
    public Staff create(Staff staff) {
        Staff staff1 = staffTable.save(staff);
        return staff1;
    }

    @Override
    public Staff update(Staff staff) {
        Staff staff1 = staffTable.save(staff);
        return staff1;
    }

    @Override
    public void delete(String[] s) {
        staffTable.deleteById(s);

    }

    @Override
    public Staff read(String[] s) {
        Optional<Staff> staff = this.staffTable.findById(s);
        return staff.orElse(null);
    }
}
