package com.salon.repositories.hairRepository;

import com.salon.domain.hair.HairStyle;
import com.salon.repositories.IRepository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface HairStyleRepository extends JpaRepository<HairStyle,String[]> {

}
