package com.salon.service.impl.paymentServiceImpl;

import com.salon.domain.payment.CardPayment;
import com.salon.repositories.paymentRepository.CardPaymentRepository;
import com.salon.service.paymentService.CardPaymentService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Service
public class CardPaymentServiceImpl implements CardPaymentService {

    private static CardPaymentServiceImpl service = null;
    private Map<Double,CardPayment> cardPaymentTable;

    private CardPaymentServiceImpl() {
        cardPaymentTable = new HashMap<>();

    }
    public static CardPaymentService getService(){
        if(service == null) service = new CardPaymentServiceImpl();
        return service;
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
