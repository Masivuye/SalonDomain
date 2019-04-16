package factory.ordersFactory;
import domain.orders.Order;

public class OderFactory {
    public static Order getOrders(String name,double price){
        return new Order.Builder().name("Shampoo")
                .price(59.99)
                .build();
    }


}
