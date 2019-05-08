package com.salon.repositories.staffRepository;

import com.salon.domain.staff.HairStyler;
import com.salon.repositories.IRepository.IRepository;

import java.util.Set;

public interface HairStylerRepository extends IRepository<HairStyler,String> {
    Set<HairStyler> getAll();
}
