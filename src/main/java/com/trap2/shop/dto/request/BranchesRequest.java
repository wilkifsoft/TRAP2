package com.trap2.shop.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BranchesRequest
{
  private String street;
  private int number;
  private String openingHour;
  private String closingTime;
  private String fromDay;
  private String toDay;

  private String departement;
  private String arrondissement;
  private String commune;
  private String section_Communale;
}
