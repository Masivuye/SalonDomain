package repositories.staffRepository;

import domain.staff.Staff;
import repositories.IRepository.IRepository;

import java.util.Set;

public interface StaffRepository extends IRepository<Staff,String[]> {
     Set<Staff> getAll();
}
