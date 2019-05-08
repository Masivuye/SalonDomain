package com.salon.service.staffService;

import com.salon.domain.staff.Admin;
import com.salon.service.serviceInterface.ServiceInterface;

import java.util.Set;

public interface AdminService extends ServiceInterface<Admin,Integer> {
    Set<Admin> getAll();
}
