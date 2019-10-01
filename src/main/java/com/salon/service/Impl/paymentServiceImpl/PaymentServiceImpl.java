package com.salon.service.Impl.paymentServiceImpl;

import com.salon.domain.payment.Payment;
import com.salon.repositories.paymentRepository.PaymentRepository;
import com.salon.service.paymentService.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
@Service
public class PaymentServiceImpl implements PaymentService {

    private static PaymentServiceImpl service = null;
    @Autowired
    private PaymentRepository paymentTable;

    private PaymentServiceImpl() {

    }
    public static PaymentService getService(){
        if(service == null) service = new PaymentServiceImpl();
        return service;
    }

    @Override
    public Set<Payment> getAll() {
        return (Set<Payment>) this.paymentTable.findAll();
    }

    @Override
    public Payment create(Payment payment) {
        Payment payment1 = paymentTable.save(payment);
        return payment1;
    }

    @Override
    public Payment update(Payment payment) {
        Payment payment1 = paymentTable.save(payment);
        return payment1;
    }

    @Override
    public void delete(String a) {
        this.paymentTable.deleteById(a);

    }

    @Override
    public Payment read(String s) {
        Optional<Payment> payment = this.paymentTable.findById(s);
        return payment.orElse(null);
    }
}
