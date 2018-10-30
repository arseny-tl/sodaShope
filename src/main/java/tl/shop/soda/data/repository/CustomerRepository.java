package tl.shop.soda.data.repository;

import org.springframework.data.repository.CrudRepository;
import tl.shop.soda.data.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {}
