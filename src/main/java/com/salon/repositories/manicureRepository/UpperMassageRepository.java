package com.salon.repositories.manicureRepository;

import com.salon.domain.manicure.UpperMassage;
import com.salon.repositories.IRepository.IRepository;

import java.util.Set;

public interface UpperMassageRepository extends IRepository<UpperMassage,Double> {
    Set<UpperMassage> getAll();
}
