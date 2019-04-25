package repositories.impl.staffImpl;

import domain.staff.HairStyler;
import repositories.staffRepository.HairStylerRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HairStylerRepositoryImpl implements HairStylerRepository {

    private static HairStylerRepositoryImpl repository = null;
    private Map<String,HairStyler> hairStylerTable;

    private HairStylerRepositoryImpl() {
        hairStylerTable = new HashMap<>();

    }
    public static HairStylerRepository getRepository(){
        if(repository == null) repository = new HairStylerRepositoryImpl();
        return repository;
    }

    @Override
    public Set<HairStyler> getAll() {
        return null;
    }

    @Override
    public HairStyler create(HairStyler hairStyler) {
        hairStylerTable.put(hairStyler.getName(),hairStyler);
        HairStyler hairStyler1 = hairStylerTable.get(hairStyler.getName());
        return hairStyler1;
    }

    @Override
    public HairStyler update(HairStyler hairStyler) {
        hairStylerTable.put(hairStyler.getName(),hairStyler);
        HairStyler hairStyler1 = hairStylerTable.get(hairStyler.getName());
        return hairStyler1;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public HairStyler read(String s) {
        return null;
    }
}
