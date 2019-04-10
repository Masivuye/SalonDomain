package domain;

import java.util.Set;

public class Customer {
    private String name;
    private int custNumber;

    private Set<Booking> booking;

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
        private Set<Booking> booking;

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

