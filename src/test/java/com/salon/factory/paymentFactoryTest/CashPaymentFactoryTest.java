package com.salon.factory.paymentFactoryTest;

import com.salon.domain.payment.CashPayment;
import com.salon.factory.paymentFactory.CashPaymentFactory;
import org.junit.Assert;
import org.junit.Test;

public class CashPaymentFactoryTest {
    @Test
    public void getCash(){
        double amount =0;
        CashPayment cashPayment = CashPaymentFactory.getCash(amount);
        Assert.assertNotNull(amount);
        System.out.println(cashPayment.getAmount(amount));
    }
}
