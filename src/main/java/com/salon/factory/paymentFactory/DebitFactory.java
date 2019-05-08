package com.salon.factory.paymentFactory;

import com.salon.domain.payment.Debit;

public class DebitFactory {
    public static Debit getDebit(double balance){
        return new Debit.Builder()
                .balance(1000.00)
                .build();
    }
}
