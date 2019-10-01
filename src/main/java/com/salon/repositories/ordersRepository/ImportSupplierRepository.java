package com.salon.repositories.ordersRepository;

import com.salon.domain.orders.ImportSupplier;
import com.salon.repositories.IRepository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface ImportSupplierRepository extends JpaRepository<ImportSupplier,Integer> {

}
