package com.salon.service.manicureService;

import com.salon.domain.manicure.Nails;
import com.salon.service.serviceInterface.ServiceInterface;

import java.util.Set;

public interface NailsService extends ServiceInterface<Nails,String[]> {
    Set<Nails> getAll();
}
