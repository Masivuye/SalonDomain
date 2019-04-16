package domain.payment;

import java.util.Set;

public class CardPayment {
    private double balance;


    private Set<Payment> payments;
    private Set<Cheque> cheques;


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
