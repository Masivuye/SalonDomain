package repositories.impl.hairImpl;

import domain.hair.BoysCut;
import repositories.hairRepository.BoysCutRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BoysCutRepositoryImpl implements BoysCutRepository {
    private static BoysCutRepositoryImpl repository = null;
    private Map<String, BoysCut> boysCutTable;

    private BoysCutRepositoryImpl() {
        boysCutTable = new HashMap<String, BoysCut>();

    }
    public static BoysCutRepository getRepository(){
        if(repository == null) repository = new BoysCutRepositoryImpl();
        return repository;
    }

    @Override
    public Set<BoysCut> getAll() {
        return null;
    }

    @Override
    public BoysCut create(BoysCut boysCut) {
        return null;
    }

    @Override
    public BoysCut update(BoysCut boysCut) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public BoysCut read(String s) {
        return null;
    }
}