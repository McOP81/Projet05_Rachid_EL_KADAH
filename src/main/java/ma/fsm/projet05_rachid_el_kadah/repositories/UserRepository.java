package ma.fsm.projet05_rachid_el_kadah.repositories;

import ma.fsm.projet05_rachid_el_kadah.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findByUsername(String userName);

}
