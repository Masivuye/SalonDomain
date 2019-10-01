package com.salon.repositories.paymentRepository;

import com.salon.domain.payment.CashPayment;
import com.salon.repositories.IRepository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface CashPaymentRepository extends JpaRepository<CashPayment,String> {

}
