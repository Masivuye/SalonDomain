package com.salon.service.Impl.paymentServiceImpl;

import com.salon.domain.payment.Debit;
import com.salon.service.paymentService.DebitService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Service
public class DebitServiceImpl implements DebitService {

    private static DebitServiceImpl service = null;
    private Map<Double,Debit> debitTable;

    private DebitServiceImpl() {
        debitTable = new HashMap<>();

    }
    public static DebitService getService(){
        if(service == null) service = new DebitServiceImpl();
        return service;
    }

    @Override
    public Set<Debit> getAll() {
        return null;
    }

    @Override
    public Debit create(Debit debit) {
        debitTable.put(debit.getBalance(0.0),debit);
        Debit debit1 = debitTable.get(debit.getBalance(0.0));
        return debit1;
    }

    @Override
    public Debit update(Debit debit) {
        debitTable.put(debit.getBalance(0.0),debit);
        Debit debit1 = debitTable.get(debit.getBalance(0.0));
        return debit1;
    }

    @Override
    public void delete(Double aDouble) {
        debitTable.remove(aDouble);

    }

    @Override
    public Debit read(Double aDouble)
    {
        Debit debit = debitTable.get(aDouble);
        return debit;
    }
}
