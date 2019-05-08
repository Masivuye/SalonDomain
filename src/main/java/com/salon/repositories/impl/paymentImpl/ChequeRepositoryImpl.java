package com.salon.repositories.impl.paymentImpl;

import com.salon.domain.payment.Cheque;
import com.salon.repositories.paymentRepository.ChequeRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ChequeRepositoryImpl implements ChequeRepository {

    private static ChequeRepositoryImpl repository = null;
    private Map<Double,Cheque> chequeTable;

    private ChequeRepositoryImpl() {
        chequeTable = new HashMap<>();

    }
    public static ChequeRepository getRepository(){
        if(repository == null) repository = new ChequeRepositoryImpl();
        return repository;
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
