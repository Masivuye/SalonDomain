package com.salon.domain.payment;



import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Set;
@Entity
public class Debit {
    @Id
    private double balance;


    private Set<CardPayment> payments;


    private Debit() {
    }

    private Debit(Builder builder) {
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


        public Debit build() {
            return new Debit(this);
        }
    }

    @Override
    public String toString() {
        return "Debit{" +
                "balance=" + balance +
                '}';
    }
}
