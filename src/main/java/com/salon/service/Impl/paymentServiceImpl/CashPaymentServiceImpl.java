package com.salon.service.Impl.paymentServiceImpl;

import com.salon.domain.payment.CashPayment;
import com.salon.repositories.paymentRepository.CashPaymentRepository;
import com.salon.service.paymentService.CashPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
@Service
public class CashPaymentServiceImpl implements CashPaymentService {

    private static CashPaymentServiceImpl service = null;
    @Autowired
    private CashPaymentRepository cashPaymentTable;

    private CashPaymentServiceImpl() {
    }
    public static CashPaymentService getService(){
        if(service == null) service = new CashPaymentServiceImpl();
        return service;
    }

    @Override
    public Set<CashPayment> getAll() {
        return (Set<CashPayment>) this.cashPaymentTable.findAll();
    }

    @Override
    public CashPayment create(CashPayment cashPayment) {
        CashPayment cashPayment1 = cashPaymentTable.save(cashPayment);
        return cashPayment1;
    }

    @Override
    public CashPayment update(CashPayment cashPayment) {
        CashPayment cashPayment1 = cashPaymentTable.save(cashPayment);
        return cashPayment1;
    }

    @Override
    public void delete(String s) {
        cashPaymentTable.deleteById(s);

    }

    @Override
    public CashPayment read(String s) {
        Optional<CashPayment> cashPayment = this.cashPaymentTable.findById(s);
        return cashPayment.orElse(null);
    }
}
