package com.salon.domain.manicure;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Set;
@EntityScan
public class FullMassage {
    private double price;



    private Set<Massage> massages;

    private FullMassage() {
    }

    private FullMassage(Builder builder) {
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
