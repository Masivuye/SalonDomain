package repositories.ordersRepository;

import domain.orders.ImportSupplier;
import repositories.IRepository.IRepository;

import java.util.Set;

public interface ImportSupplierRepository extends IRepository<ImportSupplier,String> {
    Set<ImportSupplier> getAll();
}
