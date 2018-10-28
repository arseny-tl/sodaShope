package tl.shop.soda.data.service;

import tl.shop.soda.data.entity.UserAccount;
import tl.shop.soda.web.model.UserModel;

public interface IUserService {
  UserAccount registerNewUserAccount(UserModel userModel) throws EmailExistsException, UsernameExistsException;
}
