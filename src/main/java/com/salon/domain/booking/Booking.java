package com.salon.domain.booking;


import com.salon.domain.staff.Staff;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;
import java.util.Set;
@EntityScan
public class Booking {
    private Date date;
    private int bookingNumber;
    private Customer customer;
    private Set<Staff> staff;

    private Booking(){}

    private Booking(Builder builder){
        this.date = builder.date;
        this.bookingNumber = builder.bookingNumber;
    }

    public Date getDate() {
        return date;
    }

    public int getBookingNumber() {
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
        public Builder copy(Booking booking){
            this.date = booking.date;
            this.bookingNumber = booking.bookingNumber;

            return this;
        }
        public Booking build(){
            return new Booking(this);
        }
    }

    @Override
    public String toString() {
        return "Booking{" +
                "date=" + date +
                ", bookingNumber=" + bookingNumber +
                '}';
    }
}
