package com.salon.domain.hair;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Arrays;
import java.util.Set;
@EntityScan
public class GirlsHair {
    private double price;
    private String[] types;
    private Set<HairStyle> customer;

    private GirlsHair(){}

    private GirlsHair(Builder builder){
        this.price = builder.price;
        this.types = builder.types;
    }

    public double getPrice() {
        return price;
    }

    public String[] getTypes() {
        return types;
    }

    public static class Builder{
        private double price;
        private String[] types;


        public Builder price(double price){
            this.price = price;
            return this;
        }
        public Builder types(String[] types){
            this.types = types;
            return this;
        }
        public GirlsHair build(){
            return new GirlsHair(this);
        }
    }

    @Override
    public String toString() {
        return "GirlsHair{" +
                "price=" + price +
                ", types=" + Arrays.toString(types) +
                '}';
    }
}
