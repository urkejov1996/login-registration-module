package com.lumenspei.userloginandregistrationmodule.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


import com.lumenspei.userloginandregistrationmodule.PasswordConstraint.ValidPassword;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
//@NoArgsConstructor
@ToString
public class RegistrationRequest {
    @NotNull(message = "Username is required")
    @Size(min = 3, max = 30, message = "Username should have between 3 and 30 characters")
    private final String firstName;
    @NotNull(message = "Username is required")
    @Size(min = 3, max = 30, message = "Username should have between 3 and 30 characters")
    private final String lastName;
    @NotNull(message = "Email is required")

    @Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}",
            flags = Pattern.Flag.CASE_INSENSITIVE)
    private final String email;
    @ValidPassword
    private final String password;
    @ValidPassword
    private final String confirmPassword;


}
