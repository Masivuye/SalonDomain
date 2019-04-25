package repositories.manicureRepository;

import domain.manicure.FullMassage;
import repositories.IRepository.IRepository;

import java.util.Set;

public interface FullMassageRepository extends IRepository<FullMassage,String> {
    Set<FullMassage> getAll();
}
