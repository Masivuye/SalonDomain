package com.salon.repositories.staffRepository;

import com.salon.domain.staff.Admin;
import com.salon.repositories.IRepository.IRepository;

import java.util.Set;

public interface AdminRepository extends IRepository<Admin,Integer> {
    Set<Admin> getAll();
}
