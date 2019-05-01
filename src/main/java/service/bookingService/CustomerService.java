package service.bookingService;

import domain.booking.Customer;
import service.serviceInterface.ServiceInterface;

import java.util.Set;

public interface CustomerService extends ServiceInterface<Customer ,String> {
    Set<Customer> getAll();
}
