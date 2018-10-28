package tl.shop.soda.data.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "cheque")
public class Cheque {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private long id;

  @NotNull
  @Column(name = "customer_id")
  private long customerId;

  @Column(name = "positions")
 // @ElementCollection
 // @OneToMany(mappedBy = "cheque", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private int[] positions;//List<Integer> positions;

  @NotNull
  @Column(name = "sell_timestamp")
  private LocalDateTime sellTimestamp;
}