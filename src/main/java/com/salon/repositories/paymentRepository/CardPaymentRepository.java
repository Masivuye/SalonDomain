package com.salon.repositories.paymentRepository;

import com.salon.domain.payment.CardPayment;
import com.salon.repositories.IRepository.IRepository;

import java.util.Set;

public interface CardPaymentRepository extends IRepository<CardPayment,Double> {
    Set<CardPayment> getAll();
}
