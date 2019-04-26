package repositories.impl.manicureImpl;

import domain.manicure.Massage;
import repositories.manicureRepository.MassageRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MassageRepositoryImpl implements MassageRepository {

    private static MassageRepositoryImpl repository = null;
    private Map<String[],Massage> massageTable;

    private MassageRepositoryImpl() {
        massageTable = new HashMap<>();

    }
    public static MassageRepository getRepository(){
        if(repository == null) repository = new MassageRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Massage> getAll() {
        return null;
    }

    @Override
    public Massage create(Massage massage) {
        massageTable.put(massage.getTypes(),massage);
        Massage massage1 = massageTable.get(massage.getTypes());
        return massage1;
    }

    @Override
    public Massage update(Massage massage) {
        massageTable.put(massage.getTypes(),massage);
        Massage massage1 = massageTable.get(massage.getTypes());
        return massage1;
    }

    @Override
    public void delete(String[] s) {

    }

    @Override
    public Massage read(String[] s) {
        return null;
    }
}
