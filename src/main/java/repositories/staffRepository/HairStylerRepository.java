package repositories.staffRepository;

import domain.staff.HairStyler;
import repositories.IRepository.IRepository;

import java.util.Set;

public interface HairStylerRepository extends IRepository<HairStyler,String> {
    Set<HairStyler> getAll();
}
