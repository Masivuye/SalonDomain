package repositories.hairRepository;

import domain.hair.GirlsHair;
import repositories.IRepository.IRepository;

import java.util.Set;

public interface GirlsHairRepository extends IRepository<GirlsHair, String> {
    Set<GirlsHair> getAll();
}
