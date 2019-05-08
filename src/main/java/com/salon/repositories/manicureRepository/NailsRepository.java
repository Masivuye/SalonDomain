package com.salon.repositories.manicureRepository;

import com.salon.domain.manicure.Nails;
import com.salon.repositories.IRepository.IRepository;

import java.util.Set;

public interface NailsRepository extends IRepository<Nails,String[]> {
    Set<Nails> getAll();
}
