package com.salon.repositories.staffRepository;

import com.salon.domain.staff.Cleaners;
import com.salon.repositories.IRepository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface CleanersRepository extends JpaRepository<Cleaners,String> {

}
