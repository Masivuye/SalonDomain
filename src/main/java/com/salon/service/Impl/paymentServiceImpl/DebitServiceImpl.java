package com.salon.service.Impl.paymentServiceImpl;

import com.salon.domain.payment.Debit;
import com.salon.repositories.paymentRepository.DebitRepository;
import com.salon.service.paymentService.DebitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
@Service
public class DebitServiceImpl implements DebitService {

    private static DebitServiceImpl service = null;
    @Autowired
    private DebitRepository debitTable;

    private DebitServiceImpl() {

    }
    public static DebitService getService(){
        if(service == null) service = new DebitServiceImpl();
        return service;
    }

    @Override
    public Set<Debit> getAll() {
        return (Set<Debit>) this.debitTable.findAll();
    }

    @Override
    public Debit create(Debit debit) {
        Debit debit1 = debitTable.save(debit);
        return debit1;
    }

    @Override
    public Debit update(Debit debit) {
        Debit debit1 = debitTable.save(debit);
        return debit1;
    }

    @Override
    public void delete(String a) {
        debitTable.deleteById(a);

    }

    @Override
    public Debit read(String s) {
        Optional<Debit> debit = this.debitTable.findById(s);
        return debit.orElse(null);
    }
}
