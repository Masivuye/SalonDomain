package repositories.staffRepository;

import domain.staff.Cleaners;
import repositories.IRepository.IRepository;

import java.util.Set;

public interface CleanersRepository extends IRepository<Cleaners,String> {
    Set<Cleaners> getAll();
}
