package com.salon.domain.payment;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Set;
@EntityScan
public class CardPayment {
    private double balance;


    private Set<Payment> payments;
    private Set<Cheque> cheques;
    private Set<Debit> debit;
    private Set<Credit> credit;


    private CardPayment() {
    }

    private CardPayment(Builder builder) {
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


        public CardPayment build() {
            return new CardPayment(this);
        }
    }

    @Override
    public String toString() {
        return "CardPayment{" +
                "balance=" + balance +
                '}';
    }
}
