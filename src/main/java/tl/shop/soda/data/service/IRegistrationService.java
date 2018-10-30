package tl.shop.soda.data.service;

import tl.shop.soda.data.entity.UserAccount;
import tl.shop.soda.service.exception.useraccount.EmailExistsException;
import tl.shop.soda.service.exception.useraccount.UsernameExistsException;
import tl.shop.soda.web.model.UserModel;

public interface IRegistrationService {
  UserAccount registerNewUserAccount(UserModel userModel) throws EmailExistsException, UsernameExistsException;
}
