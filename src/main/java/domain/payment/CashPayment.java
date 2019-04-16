package domain.payment;

import java.util.Set;

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
