package repositories.paymentRepository;

import domain.payment.Payment;
import repositories.IRepository.IRepository;

import java.util.Set;

public interface PaymentRepository extends IRepository<Payment,Boolean> {
    Set<Payment> getAll();
}
