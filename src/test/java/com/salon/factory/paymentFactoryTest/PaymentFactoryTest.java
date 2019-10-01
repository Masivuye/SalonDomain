package com.salon.factory.paymentFactoryTest;

import com.salon.domain.payment.Payment;
import com.salon.factory.paymentFactory.PaymentFactory;
import org.junit.Assert;
import org.junit.Test;

public class PaymentFactoryTest {
    @Test
    public void getPayment(){
        String type = " ";
        Payment payment = PaymentFactory.getPayment(" ");
        Assert.assertEquals(" "," "," ");
        System.out.println(payment.getType());

    }
}
