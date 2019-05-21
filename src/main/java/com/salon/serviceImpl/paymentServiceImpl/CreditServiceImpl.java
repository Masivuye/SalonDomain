package com.salon.serviceImpl.paymentServiceImpl;

import com.salon.domain.payment.Credit;
import com.salon.service.paymentService.CreditService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Service
public class CreditServiceImpl implements CreditService {

    private static CreditServiceImpl service = null;
    private Map<Double,Credit> creditTable;

    private CreditServiceImpl() {
        creditTable = new HashMap<>();

    }
    public static CreditService getService(){
        if(service == null) service = new CreditServiceImpl();
        return service;
    }

    @Override
    public Set<Credit> getAll() {
        return null;
    }

    @Override
    public Credit create(Credit credit) {
        creditTable.put(credit.getBalance(0.0),credit);
        Credit credit1 = creditTable.get(credit.getBalance(0.0));
        return credit1;
    }

    @Override
    public Credit update(Credit credit) {
        creditTable.put(credit.getBalance(0.0),credit);
        Credit credit1 = creditTable.get(credit.getBalance(0.0));
        return credit1;
    }

    @Override
    public void delete(Double aDouble) {
        creditTable.remove(aDouble);

    }

    @Override
    public Credit read(Double aDouble) {
        Credit credit = creditTable.get(aDouble);
        return credit;
    }
}
