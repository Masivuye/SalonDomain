package repositories.manicureRepository;

import domain.manicure.Massage;
import repositories.IRepository.IRepository;

import java.util.Set;

public interface MassageRepository extends IRepository<Massage,String[]> {
    Set<Massage> getAll();
}
