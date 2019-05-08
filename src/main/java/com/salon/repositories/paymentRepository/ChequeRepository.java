package com.salon.repositories.paymentRepository;

import com.salon.domain.payment.Cheque;
import com.salon.repositories.IRepository.IRepository;

import java.util.Set;

public interface ChequeRepository extends IRepository<Cheque,Double> {
    Set<Cheque> getAll();
}
