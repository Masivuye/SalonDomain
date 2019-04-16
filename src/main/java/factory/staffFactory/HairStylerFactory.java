package factory.staffFactory;

import domain.staff.HairStyler;

public class HairStylerFactory {
    public static HairStyler getHairStyler(String name,int num ){
        return new HairStyler.Builder()
                .name(name)
                .stylnum(4562)
                .build();
    }

}
