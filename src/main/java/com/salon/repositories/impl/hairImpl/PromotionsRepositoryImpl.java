package com.salon.repositories.impl.hairImpl;


import com.salon.domain.hair.Promotions;
import com.salon.repositories.hairRepository.PromotionsRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Repository
public class PromotionsRepositoryImpl implements PromotionsRepository {

    private static PromotionsRepositoryImpl repository = null;
    private Map<String[],Promotions> promotionsTable;

    private PromotionsRepositoryImpl() {
        promotionsTable = new HashMap<>();

    }
    public static PromotionsRepository getRepository(){
        if(repository == null) repository = new PromotionsRepositoryImpl();
        return repository;
    }


    @Override
    public Set<Promotions> getAll() {
        return null;
    }

    @Override
    public Promotions create(Promotions promotions) {
        promotionsTable.put(promotions.getProducts(),promotions);
        Promotions promotions1 = promotionsTable.get(promotions.getProducts());
        return promotions1;
    }

    @Override
    public Promotions update(Promotions promotions) {
        promotionsTable.put(promotions.getProducts(),promotions);
        Promotions promotions1 = promotionsTable.get(promotions.getProducts());
        return promotions1;
    }

    @Override
    public void delete(String[] s) {
        promotionsTable.remove(s);

    }

    @Override
    public Promotions read(String[] s) {
        Promotions promotions = promotionsTable.get(s);
        return promotions;
    }
}
