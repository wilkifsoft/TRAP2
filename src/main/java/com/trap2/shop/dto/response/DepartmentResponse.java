package com.trap2.shop.dto.response;

import java.util.Set;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.trap2.shop.entities.Arrondissement;
import com.trap2.shop.entities.Commune;
import com.trap2.shop.entities.Departement;
import com.trap2.shop.entities.SectionCommunale;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepartmentResponse
{
  private String code;
  private String name;
  private Set<ArrondissementResponse_> arrondissementResponses;
  private Set<CommuneResponse_> communeResponses;
  private Set<SectionCommunaleResponse_> sectionCommunaleResponses;

  public DepartmentResponse(Departement departement)
  {
    this.code = departement.getCode();
    this.name = departement.getName();
    this.arrondissementResponses = getArrondissements(departement);
    this.communeResponses = getCommunes(departement);
    this.sectionCommunaleResponses = getSectionCommunales(departement);
  }

  Set<ArrondissementResponse_> getArrondissements(Departement departement)
  {
    return departement.getArrondissement().stream().map(DepartmentResponse.ArrondissementResponse_::new).collect(Collectors.toSet());
  }

  Set<CommuneResponse_> getCommunes(Departement departement)
  {
    Arrondissement arrondissement = departement.getArrondissement().stream().findFirst().get();
    return arrondissement.getCommunes().stream().map(DepartmentResponse.CommuneResponse_::new).collect(Collectors.toSet());
  }

  Set<SectionCommunaleResponse_> getSectionCommunales(Departement departement)
  {
    Arrondissement arrondissement = departement.getArrondissement().stream().findFirst().get();
    Commune commune = arrondissement.getCommunes().stream().findFirst().get();
    return commune.getSectionCommunales().stream().map(DepartmentResponse.SectionCommunaleResponse_::new).collect(Collectors.toSet());
  }


  @Getter
  @Setter
  @AllArgsConstructor
  static class ArrondissementResponse_
  {
    private String code;
    private String name;

    public ArrondissementResponse_(Arrondissement arrondissement)
    {
      this.code = arrondissement.getCode();
      this.name = arrondissement.getName();
    }
  }

  @Getter
  @Setter
  static class CommuneResponse_
  {
    private String code;
    private String name;

    public CommuneResponse_(Commune commune)
    {
      this.code = commune.getCode();
      this.name = commune.getName();
    }
  }

  @Getter
  @Setter
  static class SectionCommunaleResponse_
  {
    private String code;
    private String name;

    public SectionCommunaleResponse_(SectionCommunale sectionCommunale)
    {
      this.code = sectionCommunale.getCode();
      this.name = sectionCommunale.getName();
    }
  }
}
