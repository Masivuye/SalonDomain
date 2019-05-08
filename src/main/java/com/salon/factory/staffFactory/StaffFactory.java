package com.salon.factory.staffFactory;

import com.salon.domain.staff.Staff;

public class StaffFactory {

    public static Staff getStaff(String[] names,int staffNumber){
        return new Staff.Builder().name(names)
                .staffNumber(12563)
                .build();
    }
}
