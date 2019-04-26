package repositories.ordersRepository;

import domain.orders.Supplier;
import repositories.IRepository.IRepository;

import java.util.Set;

public interface SupplierRepository extends IRepository<Supplier,Integer> {
    Set<Supplier> getAll();
}
