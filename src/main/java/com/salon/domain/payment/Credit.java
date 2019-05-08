package com.salon.domain.payment;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Set;
@EntityScan
public class Credit {
    private double balance;


    private Set<CardPayment> cardPayment;



    private Credit() {
    }

    private Credit(Builder builder) {
        this.balance = builder.balance;

    }

    public double getBalance(double balance){

        return balance;
    }

    public static class Builder {
        private double balance;


        public Builder balance(double balance) {
            this.balance = balance;
            return this;
        }


        public Credit build() {
            return new Credit(this);
        }
    }

    @Override
    public String toString() {
        return "Credit{" +
                "balance=" + balance +
                '}';
    }
}
