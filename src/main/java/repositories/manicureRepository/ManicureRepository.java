package repositories.manicureRepository;

import domain.manicure.Manicure;
import repositories.IRepository.IRepository;

import java.util.Set;

public interface ManicureRepository extends IRepository<Manicure,String[]> {
    Set<Manicure> getAll();
}
