package com.trap2.shop.entities;

import java.io.Serializable;
import java.util.List;
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
public class Commune extends BaseEntity implements Serializable
{
  private static final long serialVersionUID = 1L;
  @ManyToOne
  @JsonIgnore
  @JoinColumn(name = "ARRONDISSEMENT", referencedColumnName = "CODE")
  private Arrondissement arrondissement;
  @OneToMany(mappedBy = "commune")
  private Set<SectionCommunale> sectionCommunales;

  @OneToMany(mappedBy = "commune")
  private List<Branches> branches;

  public Commune(String code)
  {
    super(code);
  }

  public Commune(String code, String name)
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
    Commune commune = (Commune)o;
    return getCode().equals(commune.getCode());
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(getCode());
  }

  @Override
  public String toString()
  {
    return "Commune{" +
      "code='" + getCode() + '\'' +
      "name='" + getCode() + '\'' +
      ", sectionCommunales=" + sectionCommunales +
      ", branches=" + branches +
      '}';
  }
}
