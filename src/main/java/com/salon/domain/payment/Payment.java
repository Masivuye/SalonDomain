package com.salon.domain.payment;


import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Set;
@EntityScan
public class Payment {
    private String type;


    private Set<CardPayment> cardPayments;
    private Set<CashPayment> cashPayments;



    private Payment() {
    }

    private Payment(Builder builder) {
        this.type = builder.type;

    }

    public String getType()
    { if(type.equals(cardPayments))
        {
            System.out.println(cardPayments);
        }
        else
    {
        System.out.println(cashPayments);
    }


        return type;
    }



    public static class Builder {
        private String type;



        public Builder type(String type) {
            this.type = type;
            return this;
        }


        public Payment build() {
            return new Payment(this);
        }
    }

    @Override
    public String toString() {
        return "Payment{" +
                "question=" + type +
                '}';
    }
}
