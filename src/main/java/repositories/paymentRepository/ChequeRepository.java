package repositories.paymentRepository;

import domain.payment.Cheque;
import repositories.IRepository.IRepository;

import java.util.Set;

public interface ChequeRepository extends IRepository<Cheque,Double> {
    Set<Cheque> getAll();
}
