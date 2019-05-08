package com.salon.service.manicureService;

import com.salon.domain.manicure.UpperMassage;
import com.salon.service.serviceInterface.ServiceInterface;

import java.util.Set;

public interface UpperMassageService extends ServiceInterface<UpperMassage,Double> {
    Set<UpperMassage> getAll();
}
