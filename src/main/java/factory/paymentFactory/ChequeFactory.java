package factory.paymentFactory;

import domain.payment.Cheque;
import domain.payment.Credit;

public class ChequeFactory {
    public static Cheque getCheque(double balance){
        return new Cheque.Builder()
                .balance(1000.00)
                .build();
    }
}
