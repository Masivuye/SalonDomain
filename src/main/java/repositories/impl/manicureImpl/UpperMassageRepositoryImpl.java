package repositories.impl.manicureImpl;

import domain.manicure.UpperMassage;
import repositories.manicureRepository.UpperMassageRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

    }

    @Override
    public UpperMassage read(Double aDouble) {
        return null;
    }


}
