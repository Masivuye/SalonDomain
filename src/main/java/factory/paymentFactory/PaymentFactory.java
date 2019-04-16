package factory.paymentFactory;

import domain.payment.Payment;

public class PaymentFactory {
    public static Payment getPayment(boolean question){
        return new Payment.Builder()
                .question(question)
                .build();
    }

}
