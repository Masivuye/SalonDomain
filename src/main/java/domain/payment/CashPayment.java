package domain.payment;

import java.util.Set;

public class CashPayment {
    private double balance;


    private Set<Payment> payments;


    private CashPayment() {
    }

    private CashPayment(Builder builder) {
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


        public CashPayment build() {
            return new CashPayment(this);
        }
    }

    @Override
    public String toString() {
        return "CashPayment{" +
                "balance=" + balance +
                '}';
    }
}
