package com.salon.service.Impl.paymentServiceImpl;

import com.salon.domain.payment.CashPayment;
import com.salon.service.paymentService.CashPaymentService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Service
public class CashPaymentServiceImpl implements CashPaymentService {

    private static CashPaymentServiceImpl service = null;
    private Map<Double,CashPayment> cashPaymentTable;

    private CashPaymentServiceImpl() {
        cashPaymentTable = new HashMap<>();

    }
    public static CashPaymentService getService(){
        if(service == null) service = new CashPaymentServiceImpl();
        return service;
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
