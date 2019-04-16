package domain.payment;

import java.util.Set;

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
