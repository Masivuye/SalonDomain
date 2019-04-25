package repositories.manicureRepository;

import domain.manicure.UpperMassage;
import repositories.IRepository.IRepository;

import java.util.Set;

public interface UpperMassageRepository extends IRepository<UpperMassage,String> {
    Set<UpperMassage> getAll();
}
