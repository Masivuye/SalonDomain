package com.salon.repositories.staffRepository;

import com.salon.domain.staff.Cleaners;
import com.salon.repositories.IRepository.IRepository;

import java.util.Set;

public interface CleanersRepository extends IRepository<Cleaners,String> {
    Set<Cleaners> getAll();
}
