package com.salon.service.hairService;

import com.salon.domain.hair.HairStyle;
import com.salon.service.serviceInterface.ServiceInterface;

import java.util.Set;

public interface HairStyleService extends ServiceInterface<HairStyle,String[]> {
    Set<HairStyle> getAll();
}
