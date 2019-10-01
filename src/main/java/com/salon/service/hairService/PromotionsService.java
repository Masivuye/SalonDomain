package com.salon.service.hairService;

import com.salon.domain.hair.Promotions;
import com.salon.service.serviceInterface.ServiceInterface;

import java.util.List;

public interface PromotionsService extends ServiceInterface<Promotions,String[]> {
    List<Promotions> getAll();
}
