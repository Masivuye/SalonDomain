package domain.manicure;

import java.util.Set;

public class UpperMassage {
    private double price;



    private Set<Massage> massages;

    private UpperMassage() {
    }

    private UpperMassage(Builder builder) {
        this.price = builder.price;


    }

    public double getPrice() {
        return price;
    }

    public static class Builder {

        private double price;



        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public UpperMassage build() {
            return new UpperMassage(this);
        }
    }

    @Override
    public String toString() {
        return "UpperMassage{" +
                "price=" + price +
                '}';
    }
}
