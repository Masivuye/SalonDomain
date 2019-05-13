package com.salon.repositories.impl.manicureImpl;

import com.salon.domain.manicure.UpperMassage;
import com.salon.repositories.manicureRepository.UpperMassageRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Repository
public class UpperMassageRepositoryImpl implements UpperMassageRepository {

    private static UpperMassageRepositoryImpl repository = null;
    private Map<Double,UpperMassage> upperMassageTable;

    private UpperMassageRepositoryImpl() {
        upperMassageTable = new HashMap<>();

    }
    public static UpperMassageRepository getRepository(){
        if(repository == null) repository = new UpperMassageRepositoryImpl();
        return repository;
    }

    @Override
    public Set<UpperMassage> getAll() {
        return null;
    }

    @Override
    public UpperMassage create(UpperMassage upperMassage) {
        upperMassageTable.put(upperMassage.getPrice(),upperMassage);
        UpperMassage upperMassage1 = upperMassageTable.get(upperMassage.getPrice());
        return upperMassage1;
    }

    @Override
    public UpperMassage update(UpperMassage upperMassage) {
        upperMassageTable.put(upperMassage.getPrice(),upperMassage);
        UpperMassage upperMassage1 = upperMassageTable.get(upperMassage.getPrice());
        return upperMassage1;
    }

    @Override
    public void delete(Double aDouble) {
        upperMassageTable.remove(aDouble);

    }

    @Override
    public UpperMassage read(Double aDouble) {
        UpperMassage upperMassage = upperMassageTable.get(aDouble);
        return upperMassage;
    }


}
