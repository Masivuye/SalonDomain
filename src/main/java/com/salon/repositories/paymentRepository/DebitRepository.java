package com.salon.repositories.paymentRepository;

import com.salon.domain.payment.Debit;
import com.salon.repositories.IRepository.IRepository;

import java.util.Set;

public interface DebitRepository extends IRepository<Debit,Double> {
    Set<Debit> getAll();
}
