package repositories.hairRepository;

import domain.hair.HairStyle;
import repositories.IRepository.IRepository;

import java.util.Set;

public interface HairStyleRepository extends IRepository<HairStyle,String[]> {
    Set<HairStyle> getAll();
}
