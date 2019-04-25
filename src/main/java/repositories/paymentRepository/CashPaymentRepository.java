package repositories.paymentRepository;

import domain.payment.CashPayment;
import repositories.IRepository.IRepository;

import java.util.Set;

public interface CashPaymentRepository extends IRepository<CashPayment,String> {
    Set<CashPayment> getAll();
}
