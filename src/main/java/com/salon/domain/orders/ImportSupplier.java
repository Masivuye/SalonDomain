package com.salon.domain.orders;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Set;
@EntityScan
public class ImportSupplier {
    private String name;
    private int shipedNum;

    private Set<Supplier> suppliers;



    private ImportSupplier() {
    }

    private ImportSupplier(Builder builder) {
        this.name = builder.name;
        this.shipedNum = builder.shipedNum;
    }

    public String getName() {
        return name;
    }

    public int getShipedNum() {
        return shipedNum;
    }

    public static class Builder {
        private String name;
        private int shipedNum;


        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder shipedNum(int shipedNum) {
            this.shipedNum = shipedNum;
            return this;
        }

        public ImportSupplier build() {
            return new ImportSupplier(this);
        }
    }

    @Override
    public String toString() {
        return "ImportSupplier{" +
                "name='" + name + '\'' +
                ", impSupNum=" + shipedNum +
                '}';
    }
}
