package ma.fsm.projet05_rachid_el_kadah.repositories;

import ma.fsm.projet05_rachid_el_kadah.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRoleName(String roleName);
}
