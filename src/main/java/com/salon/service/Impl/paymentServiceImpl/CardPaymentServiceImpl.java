package com.salon.service.Impl.paymentServiceImpl;

import com.salon.domain.payment.CardPayment;
import com.salon.repositories.paymentRepository.CardPaymentRepository;
import com.salon.service.paymentService.CardPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
@Service
public class CardPaymentServiceImpl implements CardPaymentService {

    private static CardPaymentServiceImpl service = null;
    @Autowired
    private CardPaymentRepository cardPaymentTable;

    private CardPaymentServiceImpl() {
    }
    public static CardPaymentService getService(){
        if(service == null) service = new CardPaymentServiceImpl();
        return service;
    }

    @Override
    public Set<CardPayment> getAll() {
        return (Set<CardPayment>) this.cardPaymentTable.findAll();
    }

    @Override
    public CardPayment create(CardPayment cardPayment) {
        CardPayment cardPayment1 = cardPaymentTable.save(cardPayment);
        return cardPayment1;
    }

    @Override
    public CardPayment update(CardPayment cardPayment) {
        CardPayment cardPayment1 = cardPaymentTable.save(cardPayment);
        return cardPayment1;
    }

    @Override
    public void delete(String s) {
        cardPaymentTable.deleteById(s);

    }

    @Override
    public CardPayment read(String s) {
        Optional<CardPayment> cardPayment = this.cardPaymentTable.findById(s);
        return cardPayment.orElse(null);
    }
}
