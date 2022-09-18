package com.trap2.shop.dto.response;

import java.util.Set;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.trap2.shop.entities.Arrondissement;
import com.trap2.shop.entities.Commune;
import com.trap2.shop.entities.SectionCommunale;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ArrondissementResponse
{
  private String code;
  private String name;
  private Set<CommuneResponse_> communeResponses;
  private Set<SectionCommunaleResponse_> sectionCommunaleResponses;

  public ArrondissementResponse(Arrondissement arrondissement)
  {
    this.code = arrondissement.getCode();
    this.name = arrondissement.getName();
    this.communeResponses = getCommunes(arrondissement);
    this.sectionCommunaleResponses = getSectionCommunales(arrondissement);
  }

  Set<CommuneResponse_> getCommunes(Arrondissement arrondissement)
  {
    return arrondissement.getCommunes().stream().map(ArrondissementResponse.CommuneResponse_::new)
      .collect(Collectors.toSet());
  }

  Set<ArrondissementResponse.SectionCommunaleResponse_> getSectionCommunales(Arrondissement arrondissement)
  {
    Commune commune = arrondissement.getCommunes().stream().findFirst().get();
    return commune.getSectionCommunales().stream().map(ArrondissementResponse.SectionCommunaleResponse_::new)
      .collect(Collectors.toSet());
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
