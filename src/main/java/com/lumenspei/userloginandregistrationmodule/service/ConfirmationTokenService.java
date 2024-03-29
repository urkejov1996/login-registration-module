package com.lumenspei.userloginandregistrationmodule.service;

import com.lumenspei.userloginandregistrationmodule.entity.ConfirmationToken;

import java.util.Optional;

public interface ConfirmationTokenService {
    void saveConfirmationToken(ConfirmationToken confirmationToken);

    Optional<ConfirmationToken> getToken(String token);

    int setConfirmedAt(String token);
}
