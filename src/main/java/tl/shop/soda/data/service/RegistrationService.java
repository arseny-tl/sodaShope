package tl.shop.soda.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tl.shop.soda.data.entity.UserAccount;
import tl.shop.soda.data.repository.UserAccountRepository;
import tl.shop.soda.web.model.UserModel;

import javax.transaction.Transactional;

@Service
public class RegistrationService implements IUserService {
  private final UserAccountRepository userAccountRepository;

  @Autowired
  public RegistrationService(UserAccountRepository userAccountRepository) {
    this.userAccountRepository = userAccountRepository;
  }

  @Transactional
  @Override
  public UserAccount registerNewUserAccount(UserModel userModel)
      throws EmailExistsException, UsernameExistsException {
    if (emailExist(userModel.getEmail())) {
      throw new EmailExistsException(
          "There is an account with that email adress: " + userModel.getEmail());
    }
    if (usernameExists(userModel.getUsername())) {
      throw new UsernameExistsException(
          ("There is an account with that username: " + userModel.getUsername()));
    }
    UserAccount user = new UserAccount();
    user.setUsername(userModel.getUsername());
    user.setPassword(userModel.getPassword());
    user.setEmail(userModel.getEmail());
    return userAccountRepository.save(user);
  }

  private boolean emailExist(String email) {
    return userAccountRepository.findByEmail(email) != null;
  }

  private boolean usernameExists(String username) {
    return userAccountRepository.findByUsername(username) != null;
  }
}
