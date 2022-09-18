package com.trap2.shop.dto.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.trap2.shop.constants.ShopConstants;
import com.trap2.shop.entities.Shop;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShopResponse
{

  private Long id;

  private String name;

  private String status;

  private String tel;

  private String siteWeb;

  private String email;
  private String description;

  private String sellerEmail;

  private String category;

  private String imagePath;

  private List<BranchesResponse> branches;

  public ShopResponse(Shop shop)
  {
    this.id = shop.getId();
    this.name = shop.getName();
    this.status = defineStatus(shop);
    this.tel = shop.getTel();
    this.siteWeb = shop.getSiteWeb();
    this.email = shop.getEmail();
    this.description = shop.getDescription();
    this.sellerEmail = shop.getSellerEmail();
    this.category = shop.getCategory().getName();
    this.imagePath = shop.getImagePath();
    this.branches = shop.getBranches().stream().map(BranchesResponse ::new).toList();
  }

  private String defineStatus(Shop shop)
  {
    return switch (shop.getStatus())
      {
        case 1 -> ShopConstants.ACTIVE_SHOP_STATUS_STR;
        case 0 -> ShopConstants.SUSPENDED_SHOP_STATUS_STR;
        default -> throw new IllegalStateException("Unexpected value: " + shop.getStatus());
      };
  }

}
