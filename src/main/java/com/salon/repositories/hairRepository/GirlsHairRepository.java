package com.salon.repositories.hairRepository;

import com.salon.domain.hair.GirlsHair;
import com.salon.repositories.IRepository.IRepository;

import java.util.Set;

public interface GirlsHairRepository extends IRepository<GirlsHair, String> {
    Set<GirlsHair> getAll();
}
