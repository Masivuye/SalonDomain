package repositories.ordersRepository;

import domain.orders.LocalSuppliers;
import repositories.IRepository.IRepository;

import java.util.Set;

public interface LocalSupplierRepository extends IRepository<LocalSuppliers,Integer> {
    Set<LocalSuppliers> getAll();
}
