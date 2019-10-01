package com.salon.factory.paymentFactory;

import com.salon.domain.payment.Payment;

public class PaymentFactory {
    public static Payment getPayment(String type){
        return new Payment.Builder()
                .type(type)
                .build();
    }

}
