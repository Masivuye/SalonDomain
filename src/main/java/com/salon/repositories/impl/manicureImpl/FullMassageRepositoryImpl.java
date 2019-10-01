/*
package com.salon.repositories.impl.manicureImpl;

import com.salon.domain.manicure.FullMassage;
import com.salon.repositories.manicureRepository.FullMassageRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Repository*/
/**//*
public class FullMassageRepositoryImpl  implements FullMassageRepository{

    private static FullMassageRepositoryImpl repository = null;
    private Map<Double,FullMassage> fullMassageTable;

    private FullMassageRepositoryImpl() {
        fullMassageTable = new HashMap<>();

    }
    public static FullMassageRepository getRepository(){
        if(repository == null) repository = new FullMassageRepositoryImpl();
        return repository;
    }
    @Override
    public Set<FullMassage> getAll() {
        return null;
    }

    @Override
    public FullMassage create(FullMassage fullMassage) {
        fullMassageTable.put(fullMassage.getPrice(),fullMassage);
        FullMassage fullMassage1 = fullMassageTable.get(fullMassage.getPrice());
        return fullMassage1;
    }

    @Override
    public FullMassage update(FullMassage fullMassage) {
        fullMassageTable.put(fullMassage.getPrice(),fullMassage);
        FullMassage fullMassage1 = fullMassageTable.get(fullMassage.getPrice());
        return fullMassage1;
    }

    @Override
    public void delete(Double aDouble) {
        fullMassageTable.remove(aDouble);

    }

    @Override
    public FullMassage read(Double aDouble) {
        FullMassage fullMassage = fullMassageTable.get(aDouble);
        return fullMassage;
    }


}
*/
