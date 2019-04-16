package factory.manicureFactory;

import domain.manicure.FullMassage;

public class FullMassageFactory {

    public static FullMassage getFullMassage(double price){
        return new FullMassage.Builder()
                .price(250.00)
                .build();
    }
}
