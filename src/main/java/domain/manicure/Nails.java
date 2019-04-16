package domain.manicure;

import java.util.Set;

public class Nails {
    private String[] shapes;
    private String[] types;


    private Set<Manicure> manicure;

    private Nails() {
    }

    private Nails(Builder builder) {
        this.types = builder.types;
        this.shapes = builder.shapes;

    }

    public String[] getShapes() {
        return shapes;
    }

    public String[] getTypes() {
        return types;
    }

    public static class Builder {

        private String[] shapes;
        private String[] types;


        public Builder shapes(String[] shapes) {
            this.shapes = shapes;
            return this;
        }

        public Builder types(String[] types) {
            this.types = types;
            return this;
        }

        public Nails build() {
            return new Nails(this);
        }
    }
}
