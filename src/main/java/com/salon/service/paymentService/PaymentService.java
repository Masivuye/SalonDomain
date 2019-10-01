package com.salon.service.paymentService;

import com.salon.domain.payment.Payment;
import com.salon.service.serviceInterface.ServiceInterface;

import java.util.Set;

public interface PaymentService extends ServiceInterface<Payment,String> {
    Set<Payment> getAll();
}
