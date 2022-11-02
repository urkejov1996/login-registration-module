package com.lumenspei.userloginandregistrationmodule.controller;

import com.lumenspei.userloginandregistrationmodule.dto.request.RegistrationRequest;
import com.lumenspei.userloginandregistrationmodule.service.implementation.RegistrationServiceImpl;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Arrays;

@RestController
@RequestMapping(path = "api/v1/registration")
public class RegistrationController {

    private final RegistrationServiceImpl registrationService;

    public RegistrationController(RegistrationServiceImpl registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping(path = "/")
    public String register(@RequestBody @Valid RegistrationRequest request, BindingResult result) {
        if (result.hasErrors()){
            return Arrays.toString(result.getAllErrors().toArray());
        }
        return registrationService.register(request);
    }

    @GetMapping(path = "confirm")
    public String confirm(@RequestParam("token") String token) {
        return registrationService.confirmToken(token);
    }
}
