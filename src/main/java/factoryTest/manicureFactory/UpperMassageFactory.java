package factoryTest.manicureFactory;

import domain.manicure.UpperMassage;

public class UpperMassageFactory {

    public static UpperMassage getUpperMassage(double price){
        return new UpperMassage.Builder()
                .price(150.00).build();
    }
}
