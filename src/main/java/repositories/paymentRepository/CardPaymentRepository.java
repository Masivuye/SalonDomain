package repositories.paymentRepository;

import domain.payment.CardPayment;
import repositories.IRepository.IRepository;

import java.util.Set;

public interface CardPaymentRepository extends IRepository<CardPayment,String> {
    Set<CardPayment> getAll();
}