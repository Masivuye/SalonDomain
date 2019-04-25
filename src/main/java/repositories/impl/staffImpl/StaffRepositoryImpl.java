package repositories.impl.staffImpl;

import domain.staff.Staff;
import repositories.staffRepository.StaffRepository;

import java.util.HashSet;
import java.util.Set;

public class StaffRepositoryImpl implements StaffRepository{

    private static StaffRepositoryImpl repository = null;
    private Set<Staff> staffTable;

    private StaffRepositoryImpl() {
        this.staffTable = new HashSet<>();

    }
    public static StaffRepository getRepository(){
        if(repository == null) repository = new StaffRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Staff> getAll() {
        return null;
    }

    @Override
    public Staff create(Staff staff) {
        this.staffTable.add(staff);
        return null;
    }

    @Override
    public Staff update(Staff staff) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Staff read(String s) {
        return null;
    }
}
