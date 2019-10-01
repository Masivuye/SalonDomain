package com.salon.domain.hair;

import com.salon.domain.booking.Customer;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.Set;
@Entity
public class HairStyle {
    private double price;
    @Id
    private String[] types;
    private Set<Customer> customer;
    private Set<Promotions>promotions;

    private HairStyle(){}

    private HairStyle(Builder builder){
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
        private Set<Customer> customer;

        public Builder price(double price){
            this.price = price;
            return this;
        }
        public Builder types(String[] types){
            this.types = types;
            return this;
        }
        public HairStyle build(){
            return new HairStyle(this);
        }
    }

    @Override
    public String toString() {
        return "HairStyle{" +
                "price=" + price +
                ", types=" + Arrays.toString(types) +
                '}';
    }
}
