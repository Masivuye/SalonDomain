package com.salon.domain.staff;

import com.salon.domain.orders.Order;
import com.salon.domain.payment.Payment;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Set;
@EntityScan
public class Admin  {
    private String name;
    private int Adnum;

    private Set<Order> orders;
    private Set<Payment> payments;


    private Admin() {
    }

    private Admin(Builder builder) {
        this.name = builder.name;
        this.Adnum = builder.Adnum;
    }

    public String getName() {
        return name;
    }

    public int getAdnum() {
        return Adnum;
    }

    public static class Builder {
        private String name;
        private int Adnum;


        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder Adnum(int Adnum) {
            this.Adnum = Adnum;
            return this;
        }

        public Admin build() {
            return new Admin(this);
        }
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", Adnum=" + Adnum +
                '}';
    }
}
