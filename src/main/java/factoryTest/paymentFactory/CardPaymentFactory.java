package factoryTest.paymentFactory;

import domain.payment.CardPayment;

public class CardPaymentFactory {
    public static CardPayment getCard(double balance){
        return new CardPayment.Builder()
                .balance(1000.00)
                .build();
    }
}
