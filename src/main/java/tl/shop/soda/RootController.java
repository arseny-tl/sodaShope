package tl.shop.soda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tl.shop.soda.entity.Product;
import tl.shop.soda.repository.ProductRepository;

import java.math.BigDecimal;

@RestController
@RequestMapping("/")
public class RootController {

  @Autowired ProductRepository productRepository;

  @RequestMapping("/")
  public String glhf() {
    productRepository.save((new Product()));
    return productRepository.findAll().toString();
  }
}
