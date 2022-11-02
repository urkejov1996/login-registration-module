package service;

import entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;


public interface UserService {
    UserDetails loadUserByUsername(String email);
    String signUpUser(User user);
    int enableUser(String email);
}
