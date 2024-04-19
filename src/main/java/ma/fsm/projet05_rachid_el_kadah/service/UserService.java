package ma.fsm.projet05_rachid_el_kadah.service;

import ma.fsm.projet05_rachid_el_kadah.entities.Role;
import ma.fsm.projet05_rachid_el_kadah.entities.User;

public interface UserService {
    User addNewUser(User user);
    Role addNewRole(Role role);
    User findUserByUsername(String username);
    Role findRoleByRoleName(String roleName);
    void addRoleToUser(String username, String roleName);
    User authenticate(String username, String password);
}
