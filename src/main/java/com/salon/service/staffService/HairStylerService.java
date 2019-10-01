package com.salon.service.staffService;

import com.salon.domain.staff.HairStyler;
import com.salon.service.serviceInterface.ServiceInterface;

import java.util.List;

public interface HairStylerService extends ServiceInterface<HairStyler,String> {
    List<HairStyler> getAll();
}
