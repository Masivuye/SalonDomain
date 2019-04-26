package repositories.impl.paymentImpl;

import domain.payment.Credit;
import repositories.paymentRepository.CreditRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CreditRepositoryImpl implements CreditRepository {

    private static CreditRepositoryImpl repository = null;
    private Map<Double,Credit> creditTable;

    private CreditRepositoryImpl() {
        creditTable = new HashMap<>();

    }
    public static CreditRepository getRepository(){
        if(repository == null) repository = new CreditRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Credit> getAll() {
        return null;
    }

    @Override
    public Credit create(Credit credit) {
        creditTable.put(credit.getBalance(0.0),credit);
        Credit credit1 = creditTable.get(credit.getBalance(0.0));
        return credit1;
    }

    @Override
    public Credit update(Credit credit) {
        creditTable.put(credit.getBalance(0.0),credit);
        Credit credit1 = creditTable.get(credit.getBalance(0.0));
        return credit1;
    }

    @Override
    public void delete(Double aDouble) {

    }

    @Override
    public Credit read(Double aDouble) {
        return null;
    }
}
