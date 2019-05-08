package com.salon.service.manicureService;

import com.salon.domain.manicure.Massage;
import com.salon.service.serviceInterface.ServiceInterface;

import java.util.Set;

public interface MassageService extends ServiceInterface<Massage,String[]> {
    Set<Massage> getAll();
}
