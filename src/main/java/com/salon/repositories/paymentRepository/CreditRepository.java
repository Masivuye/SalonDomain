package com.salon.repositories.paymentRepository;

import com.salon.domain.payment.Credit;
import com.salon.repositories.IRepository.IRepository;

import java.util.Set;

public interface CreditRepository extends IRepository<Credit,Double> {
    Set<Credit>  getAll();
}
