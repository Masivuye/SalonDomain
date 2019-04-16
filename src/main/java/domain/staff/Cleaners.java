package domain.staff;

import java.util.Set;

public class Cleaners {
    private String name;
    private int Adnum;

    private Set<Staff> staff;



    private Cleaners() {
    }

    private Cleaners(Builder builder) {
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

        public Cleaners build() {
            return new Cleaners(this);
        }
    }

    @Override
    public String toString() {
        return "Cleaners{" +
                "name='" + name + '\'' +
                ", Adnum=" + Adnum +
                '}';
    }
}
