package com.trap2.shop.entities;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = "branches")
public class Departement extends BaseEntity  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @OneToMany(mappedBy = "departement", fetch = FetchType.LAZY)
  private Set<Arrondissement> arrondissement;

  @OneToMany(mappedBy = "departement", fetch = FetchType.LAZY)
  private Set<Branches> branches;

  public Departement(String code)
  {
    super(code);
  }

  @Override
  public boolean equals(Object o)
  {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Departement that = (Departement)o;
    return getCode().equals(that.getCode());
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(getCode());
  }

  @Override
  public String toString()
  {
    return "Departement{" +
      "code='" + getCode() + '\'' +
      ", name='" + getCode() + '\'' +
      ", arrondissement=" + arrondissement +
    //  ", branches=" + branches +
      '}';
  }
}
