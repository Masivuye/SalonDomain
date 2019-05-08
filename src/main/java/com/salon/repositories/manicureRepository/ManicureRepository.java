package com.salon.repositories.manicureRepository;

import com.salon.domain.manicure.Manicure;
import com.salon.repositories.IRepository.IRepository;

import java.util.Set;

public interface ManicureRepository extends IRepository<Manicure,String[]> {
    Set<Manicure> getAll();
}
