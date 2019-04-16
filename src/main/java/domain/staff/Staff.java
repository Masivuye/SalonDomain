package domain.staff;


import domain.booking.Booking;

public class Staff {
    private String name;
    private int staffNumber;

    private Booking booking;
    private HairStyler hairStyler;
    private Cleaners cleaners;

    private Staff(){}


    private Staff(Builder builder){
        this.name = builder.name;
        this.staffNumber = builder.staffNumber;

    }

    public String getName() {
        return name;
    }

    public int getStaffNumber() {
        return staffNumber;
    }
    public static class Builder{
        private String name;
        private int staffNumber;

        public Builder name(String name) {
            this.name = name;
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
                "name='" + name + '\'' +
                ", staffNumber=" + staffNumber +
                '}';
    }
}
