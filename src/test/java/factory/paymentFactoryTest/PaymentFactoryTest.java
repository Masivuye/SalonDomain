package factory.paymentFactoryTest;

import domain.payment.Payment;
import factory.paymentFactory.PaymentFactory;
import org.junit.Assert;
import org.junit.Test;

public class PaymentFactoryTest {
    @Test
    public void getPayment(){
        boolean question = false;
        Payment payment = PaymentFactory.getPayment(false);
        Assert.assertFalse(false);
        System.out.println(payment.getQuestion());

    }
}
