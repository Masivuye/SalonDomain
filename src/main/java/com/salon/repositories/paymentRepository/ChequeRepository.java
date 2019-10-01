package com.salon.repositories.paymentRepository;

import com.salon.domain.payment.Cheque;
import com.salon.repositories.IRepository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface ChequeRepository extends JpaRepository<Cheque,String> {

}
