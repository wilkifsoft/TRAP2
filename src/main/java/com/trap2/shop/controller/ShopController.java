package com.trap2.shop.controller;

import java.time.Instant;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.SortDefault;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trap2.shop.constants.ShopConstants;
import com.trap2.shop.dto.request.ShopCreateRequest;
import com.trap2.shop.dto.response.ResponseBase;
import com.trap2.shop.dto.response.ShopResponse;
import com.trap2.shop.services.ShopServices;

@RestController
@RequestMapping("/api/shop-service/")
public class ShopController
{
  public ShopController(ShopServices services)
  {
    this.services = services;
  }

  private final ShopServices services;

  @PostMapping("/add")
  public ResponseEntity<Object> createShop(@RequestBody ShopCreateRequest request)
  {
    return services.createShop(request);
  }

  @GetMapping("search")
  public ResponseEntity<ResponseBase<List<ShopResponse>>> doSearchShop(
    @RequestParam byte status, @RequestParam Long category,
    @RequestParam  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME, pattern = ShopConstants.YYYY_MM_DD_HH_MM_SS_Z) Instant fromDate,
    @RequestParam  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME, pattern = ShopConstants.YYYY_MM_DD_HH_MM_SS_Z)Instant toDate, @PageableDefault @SortDefault.SortDefaults(
    { @SortDefault(sort = "createdDate", direction = Sort.Direction.ASC) }) Pageable pageable)
  {
    return services.doSearchShop(status, category, fromDate, toDate, pageable);
  }

  @GetMapping("findBySellerEmail")
  public ResponseEntity<ResponseBase<List<ShopResponse>>> findBySellerEmail(@RequestParam String sellerEmail,
    @PageableDefault() @SortDefault.SortDefaults(
      { @SortDefault(sort = "createdDate", direction = Sort.Direction.ASC) }) Pageable pageable)
  {
    return services.findBySellerEmail(sellerEmail, pageable);
  }

  @GetMapping("findByCategory_Id")
  public ResponseEntity<ResponseBase<List<ShopResponse>>> findByCategory_Id(@RequestParam Long category,
    @PageableDefault @SortDefault.SortDefaults(
      { @SortDefault(sort = "createdDate", direction = Sort.Direction.ASC) }) Pageable pageable)
  {
    return services.findByCategory_Id(category, pageable);
  }
}
