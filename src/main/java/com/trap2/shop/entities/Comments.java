package com.trap2.shop.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.NoArgsConstructor;

@Entity
/*@Getter
@Setter*/
@NoArgsConstructor
public class Comments extends AbstractAuditingEntity implements Serializable
{

  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "CONTAIN", nullable = false)
  private String contain;

  @ManyToOne
  @JsonIgnore
  private Shop shop;

  public Comments(Long id, String contain, Shop shop)
  {
    this.id = id;
    this.contain = contain;
    this.shop = shop;
  }

  public Comments(Long id)
  {
    super();
    this.id = id;
  }

  public Long getId()
  {
    return id;
  }

  public void setId(Long id)
  {
    this.id = id;
  }

  public String getContain()
  {
    return contain;
  }

  public void setContain(String contain)
  {
    this.contain = contain;
  }

/*  public Shop getShop()
  {
    return shop;
  }*/

  public void setShop(Shop shop)
  {
    this.shop = shop;
  }
}
