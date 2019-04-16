package domain.manicure;

import java.util.Arrays;
import java.util.Set;

public class Massage {

    private String[] types;


    private Set<Manicure> manicures;
    private  Set<FullMassage>fullMassages;
    private Set<UpperMassage>upperMassages;

    private Massage() {
    }

    private Massage(Builder builder) {
        this.types = builder.types;


    }

    public String[] getTypes() {
        return types;
    }

    public static class Builder {

        private String[] types;


        public Builder types(String[] types) {
            this.types = types;
            return this;
        }

        public Massage build() {
            return new Massage(this);
        }
    }

    @Override
    public String toString() {
        return "Massage{" +
                "types=" + Arrays.toString(types) +
                '}';
    }
}
