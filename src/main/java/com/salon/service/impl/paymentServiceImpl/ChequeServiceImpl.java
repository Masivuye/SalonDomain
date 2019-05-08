package com.salon.service.impl.paymentServiceImpl;

import com.salon.domain.payment.Cheque;
import com.salon.repositories.paymentRepository.ChequeRepository;
import com.salon.service.paymentService.ChequeService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Service
public class ChequeServiceImpl implements ChequeService {

    private static ChequeServiceImpl service = null;
    private Map<Double,Cheque> chequeTable;

    private ChequeServiceImpl() {
        chequeTable = new HashMap<>();

    }
    public static ChequeService getService(){
        if(service == null) service = new ChequeServiceImpl();
        return service;
    }

    @Override
    public Set<Cheque> getAll() {
        return null;
    }

    @Override
    public Cheque create(Cheque cheque) {
        chequeTable.put(cheque.getBalance(0.0),cheque);
        Cheque cheque1 = chequeTable.get(cheque.getBalance(0.0));
        return cheque1;
    }

    @Override
    public Cheque update(Cheque cheque) {
        chequeTable.put(cheque.getBalance(0.0),cheque);
        Cheque cheque1 = chequeTable.get(cheque.getBalance(0.0));
        return cheque1;
    }

    @Override
    public void delete(Double aDouble) {
        chequeTable.remove(aDouble);

    }

    @Override
    public Cheque read(Double aDouble) {
        Cheque cheque = chequeTable.get(aDouble);
        return cheque;
    }
}
