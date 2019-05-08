package com.salon.service.paymentService;

import com.salon.domain.payment.Debit;
import com.salon.service.serviceInterface.ServiceInterface;

import java.util.Set;

public interface DebitService extends ServiceInterface<Debit,Double> {
    Set<Debit> getAll();
}
