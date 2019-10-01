package com.salon.repositories.paymentRepository;

import com.salon.domain.payment.Credit;
import com.salon.repositories.IRepository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface CreditRepository extends JpaRepository<Credit,String> {

}
