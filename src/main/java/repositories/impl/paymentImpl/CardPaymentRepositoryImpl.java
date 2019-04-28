package repositories.impl.paymentImpl;

import domain.payment.CardPayment;
import repositories.paymentRepository.CardPaymentRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CardPaymentRepositoryImpl implements CardPaymentRepository {

    private static CardPaymentRepositoryImpl repository = null;
    private Map<Double,CardPayment> cardPaymentTable;

    private CardPaymentRepositoryImpl() {
        cardPaymentTable = new HashMap<>();

    }
    public static CardPaymentRepository getRepository(){
        if(repository == null) repository = new CardPaymentRepositoryImpl();
        return repository;
    }

    @Override
    public Set<CardPayment> getAll() {
        return null;
    }

    @Override
    public CardPayment create(CardPayment cardPayment) {
        cardPaymentTable.put(cardPayment.getBalance(0.0),cardPayment);
        CardPayment cardPayment1 = cardPaymentTable.get(cardPayment.getBalance(0.0));
        return cardPayment1;
    }

    @Override
    public CardPayment update(CardPayment cardPayment) {
        cardPaymentTable.put(cardPayment.getBalance(0.0),cardPayment);
        CardPayment cardPayment1 = cardPaymentTable.get(cardPayment.getBalance(0.0));
        return cardPayment1;
    }

    @Override
    public void delete(Double aDouble) {
        cardPaymentTable.remove(aDouble);

    }

    @Override
    public CardPayment read(Double aDouble) {
        CardPayment cardPayment = cardPaymentTable.get(aDouble);
        return cardPayment;
    }
}
