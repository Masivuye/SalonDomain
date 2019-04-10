package factory;

import domain.Staff;

public class StaffFactory {

    public static Staff getStaff(String name,int staffNumber){
        return new Staff.Builder().name(name)
                .staffNumber(staffNumber)
                .build();
    }
}
