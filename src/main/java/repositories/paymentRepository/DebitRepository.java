package repositories.paymentRepository;

import domain.payment.Debit;
import repositories.IRepository.IRepository;

import java.util.Set;

public interface DebitRepository extends IRepository<Debit,String> {
    Set<Debit> getAll();
}
