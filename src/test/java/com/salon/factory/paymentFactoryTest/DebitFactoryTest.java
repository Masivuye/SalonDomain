package com.salon.factory.paymentFactoryTest;

import com.salon.domain.payment.Debit;
import com.salon.factory.paymentFactory.DebitFactory;
import org.junit.Assert;
import org.junit.Test;

public class DebitFactoryTest {

    @Test
    public void getDebit(){
        double balance = 1000.00;
        Debit debit = DebitFactory.getDebit(balance);
        Assert.assertEquals(1000.00,1000.00,1000.00);
        System.out.println(balance);
    }
}
