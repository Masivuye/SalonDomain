package domain.manicure;

import java.util.Set;

public class FullMassage {
    private double price;



    private Set<Massage> massages;

    private FullMassage() {
    }

    private FullMassage(Builder builder) {
        this.price = builder.price;


    }


    public String getPrice() {
        return price;
    }

    public static class Builder {

        private double price;



        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public FullMassage build() {
            return new FullMassage(this);
        }
    }

    @Override
    public String toString() {
        return "FullMassage{" +
                "price=" + price +
                '}';
    }
}
