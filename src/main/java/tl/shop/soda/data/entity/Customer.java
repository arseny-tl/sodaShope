package tl.shop.soda.data.entity;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "customer")
public class Customer {

  @OneToOne(cascade = CascadeType.ALL)
  @PrimaryKeyJoinColumn
  private UserAccount userAccount;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private long id;

  @NotNull
  @Column(name = "full_name")
  private String fullName;

  @NotNull
  @Column(name = "wallet_ballance")
  private BigDecimal walletBallance;
}
