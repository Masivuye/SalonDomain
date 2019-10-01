package com.salon.domain.orders;
import com.salon.domain.staff.Admin;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;
@Entity
public class Order {
    @Id
    private String name;
    @OneToMany
    private double price;

    private Set<Admin> admin;
    private Set<Supplier> suppliers;



    private Order() {
    }

    private Order(Builder builder) {
        this.name = builder.name;
        this.price = builder.price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public static class Builder {
        private String name;
        private double price;


        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
