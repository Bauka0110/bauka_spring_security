package kz.bauka.baukasecurityboot.baukasecurity.services;

import kz.bauka.baukasecurityboot.baukasecurity.entities.Users;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    Users updateUser(Users user);
    Users getUser(String email);
    Users addUser(Users user);

}
