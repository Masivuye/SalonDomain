package com.salon.domain.payment;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Set;
@EntityScan
public class Cheque {
    private double balance;


    private Set<CardPayment> payments;


    private Cheque() {
    }

    private Cheque(Builder builder) {
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


        public Cheque build() {
            return new Cheque(this);
        }
    }

    @Override
    public String toString() {
        return "Cheque{" +
                "balance=" + balance +
                '}';
    }
}
