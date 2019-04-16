package domain.booking;


import domain.staff.Staff;

import java.util.Date;

public class Booking {
    private Date date;
    private int bookingNumber;
    private Customer customer;
    private Staff staff;

    private Booking(){}

    private Booking(Builder builder){
        this.date = builder.date;
        this.bookingNumber = builder.bookingNumber;
    }

    public Date getDate() {
        return date;
    }

    public int bookingNumber() {
        return bookingNumber;
    }

    public static class Builder{
        private int bookingNumber;
        private Date date;

        public Builder bookingNumber(int bookingNumber){
            this.bookingNumber = bookingNumber;
            return this;
        }
        public Builder date(Date date){
            this.date = date;
            return this;
        }
        public Booking build(){
            return new Booking(this);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
