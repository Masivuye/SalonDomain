package factory;

import domain.Customer;

public class CustomerFactory {
    public static Customer getCustomer(String name,int custNumber){
        return new Customer.Builder().name("Masivuye")
                .custNumber(211210471)
                .build();
    }
}
