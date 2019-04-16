package factory.paymentFactoryTest;

import domain.payment.CardPayment;
import factory.paymentFactory.CardPaymentFactory;
import org.junit.Assert;
import org.junit.Test;

public class CardPaymentFactoryTest {
    @Test
    public void getCard(){
        double balance = 1000.00;
        CardPayment cardPayment = CardPaymentFactory.getCard(balance);
        Assert.assertEquals(1000.00,1000.00,balance);
        System.out.println(cardPayment.getBalance(balance));
    }
}
