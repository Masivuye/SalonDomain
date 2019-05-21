package com.salon.service.Impl.hairServiceImpl;


import com.salon.domain.hair.Promotions;
import com.salon.service.hairService.PromotionsService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Service
public class PromotionsServiceImpl implements PromotionsService {

    private static PromotionsServiceImpl service = null;
    private Map<String[],Promotions> promotionsTable;

    private PromotionsServiceImpl() {
        promotionsTable = new HashMap<>();

    }
    public static PromotionsService getService(){
        if(service == null) service = new PromotionsServiceImpl();
        return service;
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
