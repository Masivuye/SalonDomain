package com.salon.repositories.staffRepository;

import com.salon.domain.staff.Staff;
import com.salon.repositories.IRepository.IRepository;

import java.util.Set;

public interface StaffRepository extends IRepository<Staff,String[]> {
     Set<Staff> getAll();
}
