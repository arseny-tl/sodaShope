package tl.shop.soda.data.repository;

import org.springframework.data.repository.CrudRepository;
import tl.shop.soda.data.entity.UserAccount;

import java.util.List;

public interface UserAccountRepository extends CrudRepository<UserAccount, Long> {

  boolean existsByUsername(String username);

  boolean existsByEmail(String email);
}
