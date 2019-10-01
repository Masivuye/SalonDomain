package com.salon.service.paymentService;

import com.salon.domain.payment.Cheque;
import com.salon.service.serviceInterface.ServiceInterface;

import java.util.Set;

public interface ChequeService extends ServiceInterface<Cheque,String> {
    Set<Cheque> getAll();
}
