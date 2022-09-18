package com.trap2.shop.entities;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Arrondissement extends BaseEntity implements Serializable
{
  private static final long serialVersionUID = 1L;
  @ManyToOne
  @JsonIgnore
  @JoinColumn(name = "DEPARTMENT", referencedColumnName = "CODE")
  private Departement departement;
  @OneToMany(mappedBy = "arrondissement")
  private Set<Commune> communes;
  @OneToMany(mappedBy = "arrondissement")
  private Set<Branches> branches;

  public Arrondissement(String code)
  {
    super(code);
  }

  public Arrondissement(String code, String name)
  {
    super(code, name);
  }

  @Override
  public boolean equals(Object o)
  {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Arrondissement that = (Arrondissement)o;
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
    return "Arrondissement{" +
      "code='" + getCode() + '\'' +
      "name='" + getName() + '\'' +
      ", communes=" + communes +
      ", branches=" + branches +
      '}';
  }
}
