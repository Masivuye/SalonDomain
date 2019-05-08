package com.salon.domain.staff;


import com.salon.domain.booking.Booking;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Set;
@EntityScan
public class Staff {
    private String[] names;
    private int staffNumber;

    private Set<Booking> booking;
    private HairStyler hairStyler;
    private Cleaners cleaners;

    private Staff(){}


    private Staff(Builder builder){
        this.names = builder.names;
        this.staffNumber = builder.staffNumber;

    }

    public String[] getName() {
        return names;
    }

    public int getStaffNumber() {
        return staffNumber;
    }
    public static class Builder{
        private String[] names;
        private int staffNumber;

        public Builder name(String[] name) {
            this.names = names;
            return this;
        }
        public Builder staffNumber(int staffNumber){
            this.staffNumber = staffNumber;
            return this;
        }
        public Staff build(){
            return new Staff(this);
        }
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + names + '\'' +
                ", staffNumber=" + staffNumber +
                '}';
    }
}
