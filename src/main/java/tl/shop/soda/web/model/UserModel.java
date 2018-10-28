package tl.shop.soda.web.model;

import lombok.Data;
import tl.shop.soda.service.validator.email.ValidEmail;
import tl.shop.soda.service.validator.password.PasswordMatches;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@PasswordMatches
public class UserModel {
  @NotNull
  @NotEmpty
  @ValidEmail
  private String email;

  @NotNull
  @NotEmpty
  private String username;

  @NotNull
  @NotEmpty
  private String password;
  
  @NotNull
  @NotEmpty
  private String matchingPassword;
}
