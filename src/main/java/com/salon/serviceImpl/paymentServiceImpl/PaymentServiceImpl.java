package com.salon.serviceImpl.paymentServiceImpl;

import com.salon.domain.payment.Payment;
import com.salon.service.paymentService.PaymentService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Service
public class PaymentServiceImpl implements PaymentService {

    private static PaymentServiceImpl service = null;
    private Map<Boolean,Payment> paymentTable;

    private PaymentServiceImpl() { paymentTable = new HashMap<>();

    }
    public static PaymentService getService(){
        if(service == null) service = new PaymentServiceImpl();
        return service;
    }

    @Override
    public Set<Payment> getAll() {
        return null;
    }

    @Override
    public Payment create(Payment payment) {
        paymentTable.put(payment.getQuestion(),payment);
        Payment payment1 = paymentTable.get(payment.getQuestion());
        return payment1;
    }

    @Override
    public Payment update(Payment payment) {
        paymentTable.put(payment.getQuestion(),payment);
        Payment payment1 = paymentTable.get(payment.getQuestion());
        return payment1;
    }

    @Override
    public void delete(Boolean aBoolean) {
        paymentTable.remove(paymentTable.isEmpty());

    }

    @Override
    public Payment read(Boolean aBoolean) {
        Payment payment = (Payment) getAll();
        return payment;
    }
}
