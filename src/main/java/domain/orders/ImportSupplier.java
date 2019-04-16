package domain.orders;

import java.util.Set;

public class ImportSupplier {
    private String name;
    private int impSupNum;

    private Set<Supplier> suppliers;



    private ImportSupplier() {
    }

    private ImportSupplier(Builder builder) {
        this.name = builder.name;
        this.impSupNum = builder.impSupNum;
    }

    public String getName() {
        return name;
    }

    public int getImpSupNum() {
        return impSupNum;
    }

    public static class Builder {
        private String name;
        private int impSupNum;


        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder locSupNum(int impSupNum) {
            this.impSupNum = impSupNum;
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
                ", impSupNum=" + impSupNum +
                '}';
    }
}
