package com.lumenspei.userloginandregistrationmodule.service;

import com.lumenspei.userloginandregistrationmodule.entity.User;
import org.springframework.security.core.userdetails.UserDetails;


public interface UserService {
    UserDetails loadUserByUsername(String email);
    String signUpUser(User user);
    int enableUser(String email);
}
