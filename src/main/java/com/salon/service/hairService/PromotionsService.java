package com.salon.service.hairService;

import com.salon.domain.hair.Promotions;
import com.salon.service.serviceInterface.ServiceInterface;

import java.util.Set;

public interface PromotionsService extends ServiceInterface<Promotions,String[]> {
    Set<Promotions> getAll();
}
