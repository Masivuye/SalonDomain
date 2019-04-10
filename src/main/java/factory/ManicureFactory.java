package factory;


import domain.Manicure;

public class ManicureFactory {

    public static Manicure getManicure(String[] colors, String[] types){
        return new Manicure.Builder()
                .colors(colors)
                .types(types)
                .build();
    }
}
