package com.salon.repositories.hairRepository;

import com.salon.domain.hair.BoysCut;
import com.salon.repositories.IRepository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface BoysCutRepository extends JpaRepository<BoysCut,String[]> {

}
