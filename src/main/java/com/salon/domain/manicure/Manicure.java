package com.salon.domain.manicure;


import com.salon.domain.booking.Customer;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Arrays;
import java.util.Set;
@EntityScan
public class Manicure {
    private String[] colors;
    private String[] types;


    private Set<Customer> customer;
    private Nails nails;
    private Massage massage;

    private Manicure() {
    }

    private Manicure(Builder builder) {
        this.types = builder.types;
        this.colors = builder.colors;

    }

    public String[] getColors() {
        return colors;
    }

    public String[] getTypes() {
        return types;
    }

    public static class Builder {

        private String[] colors;
        private String[] types;
        private Set<Customer>customers;

        public Builder colors(String[] colors) {
            this.colors = colors;
            return this;
        }

        public Builder types(String[] types) {
            this.types = types;
            return this;
        }

        public Manicure build() {
            return new Manicure(this);
        }
    }

    @Override
    public String toString() {
        return "Manicure{" +
                "colors=" + Arrays.toString(colors) +
                ", types=" + Arrays.toString(types) +
                '}';
    }
}
