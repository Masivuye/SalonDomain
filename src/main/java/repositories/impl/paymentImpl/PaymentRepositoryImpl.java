package repositories.impl.paymentImpl;

import domain.payment.Payment;
import repositories.paymentRepository.PaymentRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PaymentRepositoryImpl implements PaymentRepository {

    private static PaymentRepositoryImpl repository = null;
    private Map<Boolean,Payment> paymentTable;

    private PaymentRepositoryImpl() { paymentTable = new HashMap<>();

    }
    public static PaymentRepository getRepository(){
        if(repository == null) repository = new PaymentRepositoryImpl();
        return repository;
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
