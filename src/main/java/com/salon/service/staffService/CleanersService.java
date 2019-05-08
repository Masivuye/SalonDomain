package com.salon.service.staffService;

import com.salon.domain.staff.Cleaners;
import com.salon.service.serviceInterface.ServiceInterface;

import java.util.Set;

public interface CleanersService extends ServiceInterface<Cleaners,String> {
    Set<Cleaners> getAll();
}
