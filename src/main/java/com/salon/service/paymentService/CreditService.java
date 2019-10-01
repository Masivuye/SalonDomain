package com.salon.service.paymentService;

import com.salon.domain.payment.Credit;
import com.salon.service.serviceInterface.ServiceInterface;

import java.util.Set;

public interface CreditService extends ServiceInterface<Credit,String> {
    Set<Credit>  getAll();
}
