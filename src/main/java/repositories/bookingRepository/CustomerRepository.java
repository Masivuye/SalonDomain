package repositories.bookingRepository;

import domain.booking.Customer;
import repositories.IRepository.IRepository;

import java.util.*;

public interface CustomerRepository extends IRepository<Customer, String> {
    Set<Customer> getAll();

}
