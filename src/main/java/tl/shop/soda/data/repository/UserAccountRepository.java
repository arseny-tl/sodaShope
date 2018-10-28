package tl.shop.soda.data.repository;

import org.springframework.data.repository.CrudRepository;
import tl.shop.soda.data.entity.UserAccount;

public interface UserAccountRepository extends CrudRepository<UserAccount, Long> {

  UserAccount findByUsername(String username);
  boolean existsByUsername(String username);
  UserAccount findByEmail(String email);

}
