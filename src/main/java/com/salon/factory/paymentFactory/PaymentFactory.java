package com.salon.factory.paymentFactory;

import com.salon.domain.payment.Payment;

public class PaymentFactory {
    public static Payment getPayment(boolean question){
        return new Payment.Builder()
                .question(question)
                .build();
    }

}
