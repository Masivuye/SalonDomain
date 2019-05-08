package com.salon.repositories.hairRepository;

import com.salon.domain.hair.Promotions;
import com.salon.repositories.IRepository.IRepository;

import java.util.Set;

public interface PromotionsRepository extends IRepository<Promotions,String[]> {
    Set<Promotions> getAll();
}
