package com.salon.service.manicureService;

import com.salon.domain.manicure.FullMassage;
import com.salon.service.serviceInterface.ServiceInterface;

import java.util.Set;

public interface FullMassageService extends ServiceInterface<FullMassage,Double> {
    Set<FullMassage> getAll();

}
