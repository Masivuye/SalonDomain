package repositories.impl.staffImpl;

import domain.staff.Cleaners;
import repositories.staffRepository.CleanersRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CleanersRepositoryImpl implements CleanersRepository {

    private static CleanersRepositoryImpl repository = null;
    private Map<String,Cleaners> cleanersTable;

    private CleanersRepositoryImpl() {
        cleanersTable = new HashMap<>();

    }
    public static CleanersRepository getRepository(){
        if(repository == null) repository = new CleanersRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Cleaners> getAll() {
        return null;
    }

    @Override
    public Cleaners create(Cleaners cleaners) {
        cleanersTable.put(cleaners.getName(),cleaners);
        Cleaners cleaners1 = cleanersTable.get(cleaners.getName());
        return cleaners1;
    }

    @Override
    public Cleaners update(Cleaners cleaners) {
        cleanersTable.put(cleaners.getName(),cleaners);
        Cleaners cleaners1 = cleanersTable.get(cleaners.getName());
        return cleaners1;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Cleaners read(String s) {
        return null;
    }
}
