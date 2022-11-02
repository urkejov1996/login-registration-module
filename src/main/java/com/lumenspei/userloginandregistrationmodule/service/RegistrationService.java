package com.lumenspei.userloginandregistrationmodule.service;

import com.lumenspei.userloginandregistrationmodule.dto.request.RegistrationRequest;


public interface RegistrationService {
    String register(RegistrationRequest request);
    String confirmToken(String token);
    String buildEmail(String name, String link);
}
