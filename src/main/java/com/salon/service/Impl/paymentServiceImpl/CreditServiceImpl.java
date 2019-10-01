package com.salon.service.Impl.paymentServiceImpl;

import com.salon.domain.payment.Credit;
import com.salon.repositories.paymentRepository.CreditRepository;
import com.salon.service.paymentService.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
@Service
public class CreditServiceImpl implements CreditService {

    private static CreditServiceImpl service = null;
    @Autowired
    private CreditRepository creditTable;

    private CreditServiceImpl() {
    }
    public static CreditService getService(){
        if(service == null) service = new CreditServiceImpl();
        return service;
    }

    @Override
    public Set<Credit> getAll() {
        return (Set<Credit>) this.creditTable.findAll();
    }

    @Override
    public Credit create(Credit credit) {
        Credit credit1 = creditTable.save(credit);
        return credit1;
    }

    @Override
    public Credit update(Credit credit) {
        Credit credit1 = creditTable.save(credit);
        return credit1;
    }

    @Override
    public void delete(String a) {
        creditTable.deleteById(a);

    }

    @Override
    public Credit read(String s) {
        Optional<Credit> credit = this.creditTable.findById(s);
        return credit.orElse(null);
    }
}
