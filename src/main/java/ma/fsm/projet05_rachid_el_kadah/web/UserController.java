package ma.fsm.projet05_rachid_el_kadah.web;

import ma.fsm.projet05_rachid_el_kadah.entities.User;
import ma.fsm.projet05_rachid_el_kadah.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/users/{username}")
    public User user(@PathVariable String username){
        User user = userService.findUserByUsername(username);
        return user;
    }
}
