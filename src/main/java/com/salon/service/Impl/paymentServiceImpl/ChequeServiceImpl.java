package com.salon.service.Impl.paymentServiceImpl;

import com.salon.domain.payment.Cheque;
import com.salon.repositories.paymentRepository.ChequeRepository;
import com.salon.service.paymentService.ChequeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
@Service
public class ChequeServiceImpl implements ChequeService {

    private static ChequeServiceImpl service = null;
    @Autowired
    private ChequeRepository chequeTable;

    private ChequeServiceImpl() {
    }
    public static ChequeService getService(){
        if(service == null) service = new ChequeServiceImpl();
        return service;
    }

    @Override
    public Set<Cheque> getAll() {
        return (Set<Cheque>) this.chequeTable.findAll();
    }

    @Override
    public Cheque create(Cheque cheque) {
        Cheque cheque1 = chequeTable.save(cheque);
        return cheque1;
    }

    @Override
    public Cheque update(Cheque cheque) {
        Cheque cheque1 = chequeTable.save(cheque);
        return cheque1;
    }

    @Override
    public void delete(String a) {
        chequeTable.deleteById(a);

    }

    @Override
    public Cheque read(String s) {
        Optional<Cheque> cheque= this.chequeTable.findById(s);
        return cheque.orElse(null);
    }
}
