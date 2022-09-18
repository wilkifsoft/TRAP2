package com.trap2.shop.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShopRequest
{
  private String name;

  private String tel;

  private String siteWeb;

  private String email;

  private String description;

  private String sellerEmail;

  private Long category;

  private String imagePath;

}
