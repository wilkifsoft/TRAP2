package com.trap2.shop.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class SectionCommunale extends BaseEntity  implements Serializable
{

  private static final long serialVersionUID = 1L;
  @ManyToOne
  @JsonIgnore
  @JoinColumn(name = "COMMUNE", referencedColumnName = "CODE")
  private Commune commune;

  public SectionCommunale(String code)
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
    SectionCommunale that = (SectionCommunale)o;
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
    return "Section_Communale{" +
      "code='" + getCode() + '\'' +
      "name='" + getName() + '\'' +
      '}';
  }
}
