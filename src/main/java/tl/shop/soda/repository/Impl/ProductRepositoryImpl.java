package tl.shop.soda.repository.Impl;

import org.springframework.data.repository.Repository;
import tl.shop.soda.entity.Product;
import tl.shop.soda.repository.ProductRepository;

import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {

  @Override
  public Product save(Product entity) {
    return null;
  }

  @Override
  public Product findById(long productId) {
    return null;
  }

  @Override
  public List<Product> findAll() {
    return null;
  }

  @Override
  public void delete(Repository entity) {

  }
}
