package com.salon.service.manicureService;

import com.salon.domain.manicure.Manicure;
import com.salon.service.serviceInterface.ServiceInterface;

import java.util.Set;

public interface ManicureService extends ServiceInterface<Manicure,String[]> {
    Set<Manicure> getAll();
}
