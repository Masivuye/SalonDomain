package com.salon.repositories.manicureRepository;

import com.salon.domain.manicure.UpperMassage;
import com.salon.repositories.IRepository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface UpperMassageRepository extends JpaRepository<UpperMassage,Double> {

}
