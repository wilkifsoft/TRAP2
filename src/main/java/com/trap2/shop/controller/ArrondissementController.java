package com.trap2.shop.controller;

import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trap2.shop.dto.response.ArrondissementResponse;
import com.trap2.shop.services.ArrondissementService;

@RestController
@RequestMapping("/api/shop-service/arrondissement/")
public class ArrondissementController
{
  private final ArrondissementService service;

  public ArrondissementController(ArrondissementService service)
  {
    this.service = service;
  }

  @GetMapping("/findByDepartment/{code}")
  public ResponseEntity<Set<ArrondissementResponse>> findByDeprtment(@PathVariable(required = true) String code)
  {
    return service.findByDeprtment(code);
  }

  @GetMapping("/findByCode/{code}")
  public ResponseEntity<ArrondissementResponse> findByCode(@PathVariable(required = true) String code)
  {
    return service.findByCode(code);
  }
}
