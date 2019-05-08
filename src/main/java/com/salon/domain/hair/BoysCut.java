package com.salon.domain.hair;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Arrays;
import java.util.Set;
@EntityScan
public class BoysCut {
    private double price;
    private String[] types;
    private Set<HairStyle> customer;

    private BoysCut(){}

    private BoysCut(Builder builder){
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
        public BoysCut build(){
            return new BoysCut(this);
        }
    }

    @Override
    public String toString() {
        return "BoysCut{" +
                "price=" + price +
                ", types=" + Arrays.toString(types) +
                '}';
    }
}
