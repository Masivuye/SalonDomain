package factory;

import domain.Customer;
import domain.HairStyle;
import domain.Manicure;

public class CustomerFactory {
    public static Customer getCustomer(String name,int custNumber){
        return new Customer.Builder().name("Masivuye")
                .custNumber(211210471)
                .build();
    }
    public static HairStyle getHairStyle(String[] types, double price){
        return new HairStyle.Builder().price(price)
                .types(types)
                .build();
    }
    public static Manicure getManicure(String[] colors, String[] types){
        return new Manicure.Builder()
                .colors(colors)
                .types(types)
                .build();
    }
}
