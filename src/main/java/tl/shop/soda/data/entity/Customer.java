package tl.shop.soda.data.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "customer")
public class Customer implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private long id;

  @NotNull
  @Column(name = "full_name")
  private String fullName;

  @NotNull
  @Column(name = "wallet_balance")
  private BigDecimal walletBalance;

  @OneToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "useraccount_id", nullable = false)
  private UserAccount userAccount;
}
