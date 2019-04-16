package factory.staffFactory;

import domain.staff.Admin;

public class AdminFactory {

    public static Admin getAmin(String name, int num){
        return new Admin.Builder()
                .Adnum(1203)
                .name("Bulelwa")
                .build();
    }
}
