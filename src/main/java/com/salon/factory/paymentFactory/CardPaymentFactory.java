package com.salon.factory.paymentFactory;

import com.salon.domain.payment.CardPayment;

public class CardPaymentFactory {
    public static CardPayment getCard(double balance){
        return new CardPayment.Builder()
                .balance(1000.00)
                .build();
    }
}
