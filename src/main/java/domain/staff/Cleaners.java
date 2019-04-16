package domain.staff;

import java.util.Set;

public class Cleaners {
    private String name;
    private int clnNum;

    private Set<Staff> staff;



    private Cleaners() {
    }

    private Cleaners(Builder builder) {
        this.name = builder.name;
        this.clnNum = builder.clnNum;
    }

    public String getName() {
        return name;
    }

    public int getClnNum() {
        return clnNum;
    }

    public static class Builder {
        private String name;
        private int clnNum;


        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder clnNum(int clnNum) {
            this.clnNum = clnNum;
            return this;
        }

        public Cleaners build() {
            return new Cleaners(this);
        }
    }

    @Override
    public String toString() {
        return "Cleaners{" +
                "name='" + name + '\'' +
                ", Adnum=" + clnNum +
                '}';
    }
}
