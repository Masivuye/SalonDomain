package com.salon.service.hairService;

import com.salon.domain.hair.BoysCut;
import com.salon.service.serviceInterface.ServiceInterface;

import java.util.Set;

public interface BoysCutService extends ServiceInterface<BoysCut,String[]> {
    Set<BoysCut> getAll();
}
