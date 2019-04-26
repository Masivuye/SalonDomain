package repositories.staffRepository;

import domain.staff.Admin;
import repositories.IRepository.IRepository;

import java.util.Set;

public interface AdminRepository extends IRepository<Admin,Integer> {
    Set<Admin> getAll();
}
