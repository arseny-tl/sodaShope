package tl.shop.soda.data.service;

import tl.shop.soda.data.entity.UserAccount;

import java.util.List;

public interface IUserAccountService {
  UserAccount getUserAccount();
  List<UserAccount> getAllUserAccounts();
}
