package com.salon.domain.payment;


import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Set;
@EntityScan
public class Payment {
    private boolean question;


    private Set<CardPayment> cardPayments;
    private Set<CashPayment> cashPayments;



    private Payment() {
    }

    private Payment(Builder builder) {
        this.question = builder.question;

    }

    public boolean getQuestion()
    { if(question==true){

    }
        return question;
    }



    public static class Builder {
        private boolean question;



        public Builder question(boolean question) {
            this.question = question;
            return this;
        }


        public Payment build() {
            return new Payment(this);
        }
    }

    @Override
    public String toString() {
        return "Payment{" +
                "question=" + question +
                '}';
    }
}
