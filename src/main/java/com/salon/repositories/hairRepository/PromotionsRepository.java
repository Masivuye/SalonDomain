package com.salon.repositories.hairRepository;

import com.salon.domain.hair.Promotions;
import com.salon.repositories.IRepository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface PromotionsRepository extends JpaRepository<Promotions,String[]> {

}
