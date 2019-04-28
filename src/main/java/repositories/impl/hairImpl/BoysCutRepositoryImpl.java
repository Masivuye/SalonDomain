package repositories.impl.hairImpl;

import domain.hair.BoysCut;
import repositories.hairRepository.BoysCutRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BoysCutRepositoryImpl implements BoysCutRepository {

    private static BoysCutRepositoryImpl repository = null;
    private Map<String[], BoysCut> boysCutTable;

    private BoysCutRepositoryImpl() {
        boysCutTable = new HashMap<String[], BoysCut>();

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
        boysCutTable.put(boysCut.getTypes(),boysCut);
        BoysCut boysCut1 = boysCutTable.get(boysCut.getTypes());
        return boysCut1;
    }

    @Override
    public BoysCut update(BoysCut boysCut) {
        boysCutTable.put(boysCut.getTypes(),boysCut);
        BoysCut boysCut1 = boysCutTable.get(boysCut.getTypes());
        return boysCut1;
    }

    @Override
    public void delete(String s) {
        boysCutTable.remove(s);

    }

    @Override
    public BoysCut read(String s) {
        BoysCut boysCut = boysCutTable.get(s);
        return boysCut;
    }
}
