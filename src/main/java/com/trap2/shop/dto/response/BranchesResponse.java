package com.trap2.shop.dto.response;

import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.trap2.shop.entities.Branches;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchesResponse
{
  private String street;
  private int number;
  private String openingHour;
  private String closingTime;
  private String fromDay;
  private String toDay;
  private DepartmentResponse departement;
  private ArrondissementResponse arrondissement;
  private CommuneResponse commune;
  private SectionCommunaleResponse section_Communale;

  public BranchesResponse(Branches branche)
  {
    this.street=branche.getStreet();
    this.number=branche.getNumber();
    this.openingHour=branche.getOpeningHour();
    this.closingTime=branche.getClosingTime();
    this.fromDay=branche.getFromDay();
    this.toDay=branche.getToDay();
    this.departement=Optional.of(branche.getDepartement()).map(DepartmentResponse::new).orElse(null);
    this.arrondissement=Optional.of(branche.getArrondissement()).map(ArrondissementResponse::new).orElse(null);
    this.commune=Optional.of(branche.getCommune()).map(CommuneResponse::new).orElse(null); ;
    this.section_Communale= Optional.of(branche.getSection_Communale()).map(SectionCommunaleResponse::new).orElse(null);
  }

}
