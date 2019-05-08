package com.salon.service.hairService;

import com.salon.domain.hair.GirlsHair;
import com.salon.service.serviceInterface.ServiceInterface;

import java.util.Set;

public interface GirlsHairService extends ServiceInterface<GirlsHair,String[]> {
    Set<GirlsHair> getAll();
}
