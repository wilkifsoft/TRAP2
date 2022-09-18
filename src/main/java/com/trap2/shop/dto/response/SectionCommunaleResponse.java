package com.trap2.shop.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.trap2.shop.entities.SectionCommunale;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SectionCommunaleResponse
{
  private String code;
  private String name;

  public SectionCommunaleResponse(SectionCommunale sectionCommunale)
  {
    this.code = sectionCommunale.getCode();
    this.name = sectionCommunale.getName();
  }
}
