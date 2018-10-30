package tl.shop.soda.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tl.shop.soda.data.entity.UserAccount;
import tl.shop.soda.data.repository.UserAccountRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserAccountService implements IUserAccountService {

  private final UserAccountRepository userAccountRepository;

  @Autowired
  public UserAccountService(UserAccountRepository userAccountRepository) {
    this.userAccountRepository = userAccountRepository;
  }

  @Override
  public UserAccount getUserAccount() {
    return null;
  }

  @Override
  public List<UserAccount> getAllUserAccounts() {
    final ArrayList<UserAccount> result = new ArrayList<>();
    userAccountRepository.findAll().forEach(result::add);
    return result;
  }
}
