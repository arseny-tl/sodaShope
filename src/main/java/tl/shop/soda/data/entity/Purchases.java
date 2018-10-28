package tl.shop.soda.data.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "purchases")
public class Purchases {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private long id;

  @NotNull
  @Column(name = "product_id")
  private long productId;

  @NotNull
  @Column(name = "quaintity")
  private int quaintity;

  @NotNull
  @Column(name = "price")
  private BigDecimal price;
}
