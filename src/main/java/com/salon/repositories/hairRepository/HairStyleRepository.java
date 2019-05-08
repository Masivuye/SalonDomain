package com.salon.repositories.hairRepository;

import com.salon.domain.hair.HairStyle;
import com.salon.repositories.IRepository.IRepository;

import java.util.Set;

public interface HairStyleRepository extends IRepository<HairStyle,String[]> {
    Set<HairStyle> getAll();
}
