package domain.booking;

import domain.hair.HairStyle;
import domain.manicure.Manicure;

import java.util.Set;

public class Customer {
    private String name;
    private int custNumber;

    private Set<Booking> booking;
    private Set<HairStyle> hairStyles;
    private Set<Manicure> manicures;

    private Customer() {
    }

    private Customer(Builder builder) {
        this.name = builder.name;
        this.custNumber = builder.custNumber;
    }

    public String getName() {
        return name;
    }

    public int getCustNumber() {
        return custNumber;
    }

    public static class Builder {
        private String name;
        private int custNumber;


        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder custNumber(int custNumber) {
            this.custNumber = custNumber;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", custNumber=" + custNumber +
                '}';
    }
}

