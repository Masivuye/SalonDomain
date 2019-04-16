package domain.hair;

import java.util.Arrays;
import java.util.Set;

public class Promotions {
    private String[] products;

    private Set<HairStyle> hairStyles;

    private Promotions(){}

    private Promotions(Builder builder){
        this.products = builder.products;

    }

    public String[] getProducts() {
        return products;
    }


    public static class Builder{

        private String[] products;
        private Set<HairStyle> hairStyles;

        public Builder types(String[] products){
            this.products = products;
            return this;
        }
        public Promotions build(){
            return new Promotions(this);
        }
    }

    @Override
    public String toString() {
        return "Promotions{" +
                "products=" + Arrays.toString(products) +
                '}';
    }
}
