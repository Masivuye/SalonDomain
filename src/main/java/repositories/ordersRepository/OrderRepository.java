package repositories.ordersRepository;

import domain.orders.Order;
import repositories.IRepository.IRepository;

import java.util.Set;

public interface OrderRepository extends IRepository<Order,String> {
    Set<Order> getAll();
}
