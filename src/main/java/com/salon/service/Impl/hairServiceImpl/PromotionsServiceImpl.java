package com.salon.service.Impl.hairServiceImpl;


import com.salon.domain.hair.Promotions;
import com.salon.repositories.hairRepository.PromotionsRepository;
import com.salon.service.hairService.PromotionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PromotionsServiceImpl implements PromotionsService {

    private static PromotionsServiceImpl service = null;
    @Autowired
    private PromotionsRepository promotionsTable;

    private PromotionsServiceImpl() {


    }
    public static PromotionsService getService(){
        if(service == null) service = new PromotionsServiceImpl();
        return service;
    }


    @Override
    public List<Promotions> getAll() {
        return this.promotionsTable.findAll();
    }

    @Override
    public Promotions create(Promotions promotions) {
        Promotions promotions1 = promotionsTable.save(promotions);
        return promotions1;
    }

    @Override
    public Promotions update(Promotions promotions) {
        Promotions promotions1 = promotionsTable.save(promotions);
        return promotions1;
    }

    @Override
    public void delete(String[] s) {
        promotionsTable.deleteById(s);

    }

    @Override
    public Promotions read(String[] s) {
        Optional<Promotions> promotions = this.promotionsTable.findById(s);
        return promotions.orElse(null);
    }
}
