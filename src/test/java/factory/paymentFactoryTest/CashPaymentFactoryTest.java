package factory.paymentFactoryTest;

import domain.payment.CashPayment;
import factory.paymentFactory.CashPaymentFactory;
import org.junit.Assert;
import org.junit.Test;

public class CashPaymentFactoryTest {
    @Test
    public void getCash(){
        double amount =0;
        CashPayment cashPayment = CashPaymentFactory.getCash(amount);
        Assert.assertNull(amount);
        System.out.println(cashPayment.getAmount(amount));
    }
}
