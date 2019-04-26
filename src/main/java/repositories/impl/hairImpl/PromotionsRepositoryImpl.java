package repositories.impl.hairImpl;


import domain.hair.Promotions;
import domain.payment.Payment;
import repositories.hairRepository.PromotionsRepository;
import repositories.paymentRepository.PaymentRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
    public void delete(String s) {

    }

    @Override
    public Promotions read(String s) {
        return null;
    }
}
