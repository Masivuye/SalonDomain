package factoryTest.staffFactory;

import domain.staff.Cleaners;

public class CleanersFactory {

    public static Cleaners getCleaners(String name, int num){
        return  new Cleaners.Builder()
                .name(name)
                .clnNum(2136)
                .build();
    }
}
