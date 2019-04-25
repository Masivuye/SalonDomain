package repositories.paymentRepository;

import domain.payment.Credit;
import repositories.IRepository.IRepository;

import java.util.Set;

public interface CreditRepository extends IRepository<Credit,String> {
    Set<Credit>  getAll();
}
