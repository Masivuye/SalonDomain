package com.salon.service.paymentService;

import com.salon.domain.payment.CardPayment;
import com.salon.service.serviceInterface.ServiceInterface;

import java.util.Set;

public interface CardPaymentService extends ServiceInterface<CardPayment,Double> {
    Set<CardPayment> getAll();
}
