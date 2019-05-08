package com.salon.service.staffService;

import com.salon.domain.staff.Staff;
import com.salon.service.serviceInterface.ServiceInterface;

import java.util.Set;

public interface StaffService extends ServiceInterface<Staff,String[]> {
     Set<Staff> getAll();
}
