package com.salon.repositories.paymentRepository;

import com.salon.domain.payment.Payment;
import com.salon.repositories.IRepository.IRepository;

import java.util.Set;

public interface PaymentRepository extends IRepository<Payment,Boolean> {
    Set<Payment> getAll();
}
