/*
package com.salon.repositories.impl.paymentImpl;

import com.salon.domain.payment.Debit;
import com.salon.repositories.paymentRepository.DebitRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Repository*/
/**//*
public class DebitRepositoryImpl implements DebitRepository {

    private static DebitRepositoryImpl repository = null;
    private Map<Double,Debit> debitTable;

    private DebitRepositoryImpl() {
        debitTable = new HashMap<>();

    }
    public static DebitRepository getRepository(){
        if(repository == null) repository = new DebitRepositoryImpl();
        return repository;
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
*/
