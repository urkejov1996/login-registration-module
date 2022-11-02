package service;

import entity.dto.request.RegistrationRequest;
import org.springframework.stereotype.Service;


public interface RegistrationService {
    String register(RegistrationRequest request);
    String confirmToken(String token);
    String buildEmail(String name, String link);
}
