package repositories.hairRepository;

import domain.hair.BoysCut;
import repositories.IRepository.IRepository;

import java.util.Set;

public interface BoysCutRepository extends IRepository<BoysCut,String> {
    Set<BoysCut> getAll();
}
