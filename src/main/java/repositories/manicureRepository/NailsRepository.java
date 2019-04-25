package repositories.manicureRepository;

import domain.manicure.Nails;
import repositories.IRepository.IRepository;

import java.util.Set;

public interface NailsRepository extends IRepository<Nails,String> {
    Set<Nails> getAll();
}
