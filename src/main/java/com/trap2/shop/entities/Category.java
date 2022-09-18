package com.trap2.shop.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
/*@Setter
@Getter*/
public class Category implements Serializable
{
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID")
  @Basic
  private Long id;
  @Column(name = "NAME",unique = true)
  @Basic
  private String name;
  @OneToMany(mappedBy = "category")
  @JsonIgnore
  private List<Shop> shops;

  public Category(Long id)
  {
    super();
    this.id = id;
  }

  public Category()
  {
    super();
    /* TODO Auto-generated constructor stub */
  }

  @Override
  public String toString()
  {
    return "Category{" +
      "id=" + id +
      ", name='" + name + '\'' +
      '}';
  }

  @Override
  public boolean equals(Object o)
  {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Category category = (Category)o;
    return id.equals(category.id);
  }

  public Long getId()
  {
    return id;
  }

  public void setId(Long id)
  {
    this.id = id;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

/*
  public List<Shop> getShops()
  {
    return shops;
  }
*/

  public void setShops(List<Shop> shops)
  {
    this.shops = shops;
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(id);
  }
}
