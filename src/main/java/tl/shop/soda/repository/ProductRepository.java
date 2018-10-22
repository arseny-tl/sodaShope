package tl.shop.soda.repository;

import org.springframework.data.repository.Repository;
import tl.shop.soda.entity.Product;

import java.util.List;

public interface ProductRepository extends Repository<Product, Long> {
  Product save(Product entity);
  Product findById(long productId);
  List<Product> findAll();
  void delete(Repository entity);
}
