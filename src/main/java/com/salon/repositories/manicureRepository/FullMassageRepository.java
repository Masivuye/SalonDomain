package com.salon.repositories.manicureRepository;

import com.salon.domain.manicure.FullMassage;
import com.salon.repositories.IRepository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface FullMassageRepository extends JpaRepository<FullMassage,Double> {

}
