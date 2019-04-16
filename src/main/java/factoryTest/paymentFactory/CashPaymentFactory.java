package factoryTest.paymentFactory;

import domain.payment.CashPayment;

public class CashPaymentFactory {

    public static CashPayment getCash(double amount){
        return new CashPayment.Builder()
                .amount(amount)
                .build();
    }
}
