package factory.paymentFactoryTest;

import domain.payment.Credit;
import factory.paymentFactory.CreditFactory;
import org.junit.Assert;
import org.junit.Test;

public class CreditFactoryTest {

    @Test
    public void getCredit(){
        double balance = 1000.00;
        Credit credit = CreditFactory.getCredit(balance);
        Assert.assertEquals(1000.00,1000.00,1000.00);
        System.out.println(credit.getBalance(balance));
    }
}
