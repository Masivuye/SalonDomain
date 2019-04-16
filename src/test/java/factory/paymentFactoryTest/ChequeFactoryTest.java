package factory.paymentFactoryTest;

import domain.payment.Cheque;
import factory.paymentFactory.ChequeFactory;
import org.junit.Assert;
import org.junit.Test;

public class ChequeFactoryTest {
    @Test
    public void getCheque(){
        double balance = 1000.00;
        Cheque cheque = ChequeFactory.getCheque(balance);
        Assert.assertEquals(1000.00,1000.00,1000.00);
        System.out.println(cheque.getBalance(balance));
    }
}
