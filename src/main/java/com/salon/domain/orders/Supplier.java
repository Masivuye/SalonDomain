package com.salon.domain.orders;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import java.util.Set;
@Entity
public class Supplier {
    private String name;
    @Id
    private int supNum;

    private Set<Order>orders ;



    private Supplier() {
    }

    private Supplier(Builder builder) {
        this.name = builder.name;
        this.supNum = builder.supNum;
    }

    public String getName() {
        return name;
    }

    public int getSupNum() {
        return supNum;
    }

    public static class Builder {
        private String name;
        private int supNum;


        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder supNum(int supNum) {
            this.supNum = supNum;
            return this;
        }

        public Supplier build() {
            return new Supplier(this);
        }
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "name='" + name + '\'' +
                ", supNum=" + supNum +
                '}';
    }
}
