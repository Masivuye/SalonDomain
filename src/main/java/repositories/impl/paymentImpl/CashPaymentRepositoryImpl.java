package repositories.impl.paymentImpl;

import domain.payment.CashPayment;
import repositories.paymentRepository.CashPaymentRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CashPaymentRepositoryImpl implements CashPaymentRepository {

    private static CashPaymentRepositoryImpl repository = null;
    private Map<Double,CashPayment> cashPaymentTable;

    private CashPaymentRepositoryImpl() {
        cashPaymentTable = new HashMap<>();

    }
    public static CashPaymentRepository getRepository(){
        if(repository == null) repository = new CashPaymentRepositoryImpl();
        return repository;
    }

    @Override
    public Set<CashPayment> getAll() {
        return null;
    }

    @Override
    public CashPayment create(CashPayment cashPayment) {
        cashPaymentTable.put(cashPayment.getAmount(0.0),cashPayment);
        CashPayment cashPayment1 = cashPaymentTable.get(cashPayment.getAmount(0.0));
        return cashPayment1;
    }

    @Override
    public CashPayment update(CashPayment cashPayment) {
        cashPaymentTable.put(cashPayment.getAmount(0.0),cashPayment);
        CashPayment cashPayment1 = cashPaymentTable.get(cashPayment.getAmount(0.0));
        return cashPayment1;
    }

    @Override
    public void delete(Double aDouble) {

    }

    @Override
    public CashPayment read(Double aDouble) {
        return null;
    }
}
