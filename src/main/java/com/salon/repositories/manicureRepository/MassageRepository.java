package com.salon.repositories.manicureRepository;

import com.salon.domain.manicure.Massage;
import com.salon.repositories.IRepository.IRepository;

import java.util.Set;

public interface MassageRepository extends IRepository<Massage,String[]> {
    Set<Massage> getAll();
}
