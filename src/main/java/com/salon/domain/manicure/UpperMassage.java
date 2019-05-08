package com.salon.domain.manicure;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Set;
@EntityScan
public class UpperMassage {
    private double price;



    private Set<Massage> massages;

    private UpperMassage() {
    }

    private UpperMassage(Builder builder) {
        this.price = builder.price;


    }

    public Double getPrice() {
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
