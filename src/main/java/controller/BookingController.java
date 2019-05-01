package controller;


import domain.booking.Booking;
import factory.bookingFactory.BookingFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.impl.BookingServiceImpl;

import java.util.Date;
import java.util.Set;

@RestController
@RequestMapping("/salon/booking")
public class BookingController {

    @Autowired
    private BookingServiceImpl service;

    @GetMapping("/create{date}")
    public @ResponseBody
    Booking create(@PathVariable Date date, int bookingNumber){
        Booking booking = BookingFactory.getBooking(date,bookingNumber);
                return service.create(booking);

    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Booking> getAll(){
        return service.getAll();
    }
}
