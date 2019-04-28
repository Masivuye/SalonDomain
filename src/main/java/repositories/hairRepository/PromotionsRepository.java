package repositories.hairRepository;

import domain.hair.Promotions;
import repositories.IRepository.IRepository;

import java.util.Set;

public interface PromotionsRepository extends IRepository<Promotions,String[]> {
    Set<Promotions> getAll();
}
