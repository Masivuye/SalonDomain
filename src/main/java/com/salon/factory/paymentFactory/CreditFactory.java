package com.salon.factory.paymentFactory;

import com.salon.domain.payment.Credit;

public class CreditFactory {
    public static Credit getCredit(double balance){
        return new Credit.Builder()
                .balance(1000.00)
                .build();
    }
}
