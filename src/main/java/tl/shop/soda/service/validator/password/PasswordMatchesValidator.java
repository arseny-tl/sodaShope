package tl.shop.soda.service.validator.password;

import tl.shop.soda.web.model.UserModel;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator
  implements ConstraintValidator<PasswordMatches, Object> {

  @Override
  public void initialize(PasswordMatches constraintAnnotation) {
  }
  @Override
  public boolean isValid(Object obj, ConstraintValidatorContext context){
    UserModel user = (UserModel) obj;
    if (user == null || user.getPassword() == null || user.getMatchingPassword() == null) return false;
    return user.getPassword().equals(user.getMatchingPassword());
  }
}