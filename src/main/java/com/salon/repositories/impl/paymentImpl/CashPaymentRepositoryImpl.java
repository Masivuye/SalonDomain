package com.salon.repositories.impl.paymentImpl;

import com.salon.domain.payment.CashPayment;
import com.salon.repositories.paymentRepository.CashPaymentRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CashPaymentRepositoryImpl implements CashPaymentRepository {

    private static CashPaymentRepositoryImpl repository = null;
    private Map<Double,CashPayment> cashPaymentTable;

    private CashPaymentRepositoryImpl() {
        cashPaymentTable = new HashMap<>();

    }
    public static CashPaymentRepository getRepository(){
        if(repository == null) repository = new CashPaymentRepositoryImpl();
        return repository;
    }

    @Override
    public Set<CashPayment> getAll() {
        return null;
    }

    @Override
    public CashPayment create(CashPayment cashPayment) {
        cashPaymentTable.put(cashPayment.getAmount(0.0),cashPayment);
        CashPayment cashPayment1 = cashPaymentTable.get(cashPayment.getAmount(0.0));
        return cashPayment1;
    }

    @Override
    public CashPayment update(CashPayment cashPayment) {
        cashPaymentTable.put(cashPayment.getAmount(0.0),cashPayment);
        CashPayment cashPayment1 = cashPaymentTable.get(cashPayment.getAmount(0.0));
        return cashPayment1;
    }

    @Override
    public void delete(Double aDouble) {
        cashPaymentTable.remove(aDouble);

    }

    @Override
    public CashPayment read(Double aDouble) {
        CashPayment cashPayment = cashPaymentTable.get(aDouble);
        return cashPayment;
    }
}
