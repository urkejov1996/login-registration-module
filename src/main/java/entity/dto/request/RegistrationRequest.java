package entity.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import PasswordConstraint.ValidPassword;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
//@NoArgsConstructor
@ToString
public class RegistrationRequest {
    @NotNull(message = "Username is required")
    @Size(min = 3 , max = 30, message = "Username should have between 3 and 30 characters")
    private final String firstName;
    @NotNull(message = "Username is required")
    @Size(min = 3 , max = 30, message = "Username should have between 3 and 30 characters")
    private final String lastName;
    @NotNull(message = "Email is required")
    @Email
    private final String email;
    @ValidPassword
    private final String password;
    @ValidPassword
    private final String confirmPassword;


}
