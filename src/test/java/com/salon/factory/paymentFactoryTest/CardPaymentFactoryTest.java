package com.salon.factory.paymentFactoryTest;

import com.salon.domain.payment.CardPayment;
import com.salon.factory.paymentFactory.CardPaymentFactory;
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
