package com.trap2.shop.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Shop extends AbstractAuditingEntity implements Serializable
{

  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID")
  @Basic
  private Long id;
  @Basic
  @Column(name = "NAME",unique = true)
  private String name;
  @Basic
  @Column(name = "STATUS")
  private byte status;
  @Basic
  @Column(name = "TELEPHONE")
  private String tel;
  @Basic
  @Column(name = "WEB_SITE")
  private String siteWeb;
  @Basic
  @Column(name = "EMAIL")
  private String email;
  @Basic
  @Column(name = "LOGO")
  private String logo;
  @Basic
  @Column(name = "DESCRIPTION")
  private String description;
  @Basic
  @Column(name = "SELLER_EMAIL")
  private String sellerEmail;
  @ManyToOne
  @JoinColumn(name = "CATEGORY", referencedColumnName = "ID")
  private Category category;

  @Column(name = "IMAGE_PATH")
  private String imagePath;

  @OneToMany(mappedBy = "shop", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private List<Branches> branches;

  public Shop(Long id, String name, byte status, String tel, String siteWeb, String email, String logo,
    String description, String sellerEmail, Category category, String imagePath, List<Branches> branches)
  {
    this.id = id;
    this.name = name;
    this.status = status;
    this.tel = tel;
    this.siteWeb = siteWeb;
    this.email = email;
    this.logo = logo;
    this.description = description;
    this.sellerEmail = sellerEmail;
    this.category = category;
    this.imagePath = imagePath;
    this.branches = branches;
  }

  public Shop(String name, byte status, String tel, String siteWeb, String email, String logo, String description,
    String sellerEmail, Category category, String imagePath, List<Branches> branches)
  {
    this.name = name;
    this.status = status;
    this.tel = tel;
    this.siteWeb = siteWeb;
    this.email = email;
    this.logo = logo;
    this.description = description;
    this.sellerEmail = sellerEmail;
    this.category = category;
    this.imagePath = imagePath;
    this.branches = branches;
  }

  @Override
  public boolean equals(Object o)
  {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Shop shop = (Shop)o;
    return Objects.equals(id, this.id);
  }

  @Override
  public String toString()
  {
    return "Shop{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", status='" + status + '\'' +
      ", tel='" + tel + '\'' +
      ", siteWeb='" + siteWeb + '\'' +
      ", email='" + email + '\'' +
      ", logo='" + logo + '\'' +
      ", description='" + description + '\'' +
      ", sellerEmail='" + sellerEmail + '\'' +
      ", category=" + category +
      ", imagePath='" + imagePath + '\'' +
      ", annexes=" + branches +
      '}';
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(id);
  }
}
