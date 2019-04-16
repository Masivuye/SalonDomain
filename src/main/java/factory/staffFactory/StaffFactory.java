package factory.staffFactory;

import domain.staff.Staff;

public class StaffFactory {

    public static Staff getStaff(String name,int staffNumber){
        return new Staff.Builder().name(name)
                .staffNumber(12563)
                .build();
    }
}
