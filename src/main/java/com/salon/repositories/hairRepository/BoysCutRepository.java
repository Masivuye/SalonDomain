package com.salon.repositories.hairRepository;

import com.salon.domain.hair.BoysCut;
import com.salon.repositories.IRepository.IRepository;

import java.util.Set;

public interface BoysCutRepository extends IRepository<BoysCut,String[]> {
    Set<BoysCut> getAll();
}
