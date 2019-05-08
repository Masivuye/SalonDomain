package com.salon.repositories.manicureRepository;

import com.salon.domain.manicure.FullMassage;
import com.salon.repositories.IRepository.IRepository;

import java.util.Set;

public interface FullMassageRepository extends IRepository<FullMassage,Double> {
    Set<FullMassage> getAll();
}
