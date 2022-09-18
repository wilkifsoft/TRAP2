package com.trap2.shop.controller;

import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trap2.shop.dto.response.SectionCommunaleResponse;
import com.trap2.shop.services.SectionCommunaleService;

@RestController
@RequestMapping("/api/shop-service/section-communale/")
public class SectionCommunaleController
{

  private final SectionCommunaleService service;

  public SectionCommunaleController(SectionCommunaleService service)
  {
    this.service = service;
  }

  @GetMapping("findByCommune/{code}")
  public ResponseEntity<Set<SectionCommunaleResponse>> findByCommune(@PathVariable(required = true) String code){
    return service.findByCommune(code);
  }
}
