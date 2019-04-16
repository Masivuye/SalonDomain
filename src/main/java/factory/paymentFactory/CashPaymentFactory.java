package factory.paymentFactory;

import domain.payment.CashPayment;

public class CashPaymentFactory {

    public static CashPayment getCash(double amount){
        return new CashPayment.Builder()
                .balance(amount)
                .build();
    }
}
