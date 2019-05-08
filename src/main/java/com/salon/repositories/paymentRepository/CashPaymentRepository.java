package com.salon.repositories.paymentRepository;

import com.salon.domain.payment.CashPayment;
import com.salon.repositories.IRepository.IRepository;

import java.util.Set;

public interface CashPaymentRepository extends IRepository<CashPayment,Double> {
    Set<CashPayment> getAll();
}
