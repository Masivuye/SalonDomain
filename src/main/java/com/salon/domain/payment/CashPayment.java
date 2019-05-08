package com.salon.domain.payment;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Set;
@EntityScan
public class CashPayment {
    private double amount;


    private Set<Payment> payments;


    private CashPayment() {
    }

    private CashPayment(Builder builder) {
        this.amount = builder.amount;

    }

    public double getAmount(double amount){

        return amount;
    }



    public static class Builder {
        private double amount;



        public Builder amount(double amount) {
            this.amount = amount;
            return this;
        }


        public CashPayment build() {
            return new CashPayment(this);
        }
    }

    @Override
    public String toString() {
        return "CashPayment{" +
                "balance=" + amount +
                '}';
    }
}
