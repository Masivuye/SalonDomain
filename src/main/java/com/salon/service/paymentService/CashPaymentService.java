package com.salon.service.paymentService;

import com.salon.domain.payment.CashPayment;
import com.salon.service.serviceInterface.ServiceInterface;

import java.util.Set;

public interface CashPaymentService extends ServiceInterface<CashPayment,Double> {
    Set<CashPayment> getAll();
}
