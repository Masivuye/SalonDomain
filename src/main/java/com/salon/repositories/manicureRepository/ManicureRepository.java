package com.salon.repositories.manicureRepository;

import com.salon.domain.manicure.Manicure;
import com.salon.repositories.IRepository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface ManicureRepository extends JpaRepository<Manicure,String[]> {

}
