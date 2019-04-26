package repositories.impl.manicureImpl;

import domain.manicure.Nails;
import repositories.manicureRepository.NailsRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NailsRepositoryImpl implements NailsRepository {

    private static NailsRepositoryImpl repository = null;
    private Map<String[],Nails> nailsTable;

    private NailsRepositoryImpl() {
        nailsTable = new HashMap<>();

    }
    public static NailsRepository getRepository(){
        if(repository == null) repository = new NailsRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Nails> getAll() {
        return null;
    }

    @Override
    public Nails create(Nails nails) {
        nailsTable.put(nails.getColors(),nails);
        Nails nails1 = nailsTable.get(nails.getColors());
        return nails1;
    }

    @Override
    public Nails update(Nails nails) {
        nailsTable.put(nails.getColors(),nails);
        Nails nails1 = nailsTable.get(nails.getColors());
        return nails1;
    }

    @Override
    public void delete(String[] strings) {

    }

    @Override
    public Nails read(String[] strings) {
        return null;
    }
}
