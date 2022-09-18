package com.trap2.shop.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.NoArgsConstructor;

@Entity
/*@Getter
@Setter*/
@NoArgsConstructor
//@ToString(exclude = "shop")
public class Branches extends AbstractAuditingEntity implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Basic
  @Column(name = "ID")
  private Long id;
  @Basic
  @Column(name = "STREET")
  private String street;
  @Basic
  @Column(name = "NUMBER")
  private int number;
  @Basic
  @Column(name = "OPENING_HOUR")
  private String openingHour;
  @Basic
  @Column(name = "CLOSING_TIME")
  private String closingTime;
  @Basic
  @Column(name = "FORM_DAY")
  private String fromDay;
  @Basic
  @Column(name = "TO_DAY")
  private String toDay;

  @ManyToOne
  @JoinColumn(name = "SHOP", referencedColumnName = "ID", nullable = false)
  //@JsonIgnore
  @JsonBackReference
  private Shop shop;
  @ManyToOne
  @JoinColumn(name = "DEPARTMENT", referencedColumnName = "CODE", nullable = false)
  private Departement departement;
  @ManyToOne
  @JoinColumn(name = "ARRONDISSEMENT", referencedColumnName = "CODE", nullable = false)
  private Arrondissement arrondissement;
  @ManyToOne
  @JoinColumn(name = "COMMUNE", referencedColumnName = "CODE", nullable = false)
  private Commune commune;
  @ManyToOne
  @JoinColumn(name = "SEC_COMMUNALE", referencedColumnName = "CODE", nullable = false)
  private SectionCommunale section_Communale;

  public Long getId()
  {
    return id;
  }

  public void setId(Long id)
  {
    this.id = id;
  }

  public String getStreet()
  {
    return street;
  }

  public void setStreet(String street)
  {
    this.street = street;
  }

  public int getNumber()
  {
    return number;
  }

  public void setNumber(int number)
  {
    this.number = number;
  }

  public String getOpeningHour()
  {
    return openingHour;
  }

  public void setOpeningHour(String openingHour)
  {
    this.openingHour = openingHour;
  }

  public String getClosingTime()
  {
    return closingTime;
  }

  public void setClosingTime(String closingTime)
  {
    this.closingTime = closingTime;
  }

  public String getFromDay()
  {
    return fromDay;
  }

  public void setFromDay(String fromDay)
  {
    this.fromDay = fromDay;
  }

  public String getToDay()
  {
    return toDay;
  }

  public void setToDay(String toDay)
  {
    this.toDay = toDay;
  }



  public void setShop(Shop shop)
  {
    this.shop = shop;
  }

  public Departement getDepartement()
  {
    return departement;
  }

  public void setDepartement(Departement departement)
  {
    this.departement = departement;
  }

  public Arrondissement getArrondissement()
  {
    return arrondissement;
  }

  public void setArrondissement(Arrondissement arrondissement)
  {
    this.arrondissement = arrondissement;
  }

  public Commune getCommune()
  {
    return commune;
  }

  public void setCommune(Commune commune)
  {
    this.commune = commune;
  }

  public SectionCommunale getSection_Communale()
  {
    return section_Communale;
  }

  public void setSection_Communale(SectionCommunale section_Communale)
  {
    this.section_Communale = section_Communale;
  }

  public Branches(String street, int number, String openingHour, String closingTime, String fromDay, String toDay,
    Shop shop, Departement departement, Arrondissement arrondissement, Commune commune,
    SectionCommunale section_Communale)
  {
    this.street = street;
    this.number = number;
    this.openingHour = openingHour;
    this.closingTime = closingTime;
    this.fromDay = fromDay;
    this.toDay = toDay;
    this.shop = shop;
    this.departement = departement;
    this.arrondissement = arrondissement;
    this.commune = commune;
    this.section_Communale = section_Communale;
  }

  @Override
  public boolean equals(Object o)
  {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Branches branches = (Branches)o;
    return id == branches.id;
  }

/*  @Override
  public String toString()
  {
    return "Branches{" +
      "id=" + id +
      ", street='" + street + '\'' +
      ", number=" + number +
      ", openingHour='" + openingHour + '\'' +
      ", closingTime='" + closingTime + '\'' +
      ", fromDay='" + fromDay + '\'' +
      ", toDay='" + toDay + '\'' +
      ", departement=" + departement +
      ", arrondissement=" + arrondissement +
      ", commune=" + commune +
      ", section_Communale=" + section_Communale +
      '}';
  }*/

  @Override
  public int hashCode()
  {
    return Objects.hash(id);
  }

}
