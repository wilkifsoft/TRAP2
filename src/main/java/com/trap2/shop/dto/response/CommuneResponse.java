package com.trap2.shop.dto.response;

import java.util.Set;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.trap2.shop.entities.Commune;
import com.trap2.shop.entities.SectionCommunale;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommuneResponse
{
  private String code;
  private String name;
  private Set<SectionCommunaleResponse_> sectionCommunaleResponses;

  public CommuneResponse(Commune commune)
  {
    this.code = commune.getCode();
    this.name = commune.getName();
    this.sectionCommunaleResponses = getSectionCommunaleResponses(commune);
  }

  Set<CommuneResponse.SectionCommunaleResponse_> getSectionCommunaleResponses(Commune commune)
  {
    return commune.getSectionCommunales().stream().map(CommuneResponse.SectionCommunaleResponse_::new)
      .collect(Collectors.toSet());
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
