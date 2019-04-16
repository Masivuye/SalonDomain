package factoryTest.hairFactory;

import domain.hair.Promotions;

public class PromotionsFactory {
    public static String[] product = {"Shampoo","Relaxer"};

    public static Promotions getPromotions(String[] products){
        return new Promotions.Builder()
                .types(product).build();
    }
}
