package com.trap2.shop.controller;

import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trap2.shop.dto.response.CommuneResponse;
import com.trap2.shop.services.CommuneService;

@RestController
@RequestMapping("/api/shop-service/commune/")
public class CommuneController
{
  private final CommuneService service;

  public CommuneController(CommuneService service)
  {
    this.service = service;
  }

  @GetMapping("findByArrondissement/{code}")
  public ResponseEntity<Set<CommuneResponse>> findByArrondissement(@PathVariable(required = true) String code)
  {
    return service.findByArrondissement(code);
  }

  @GetMapping("/findByCode/{code}")
  public ResponseEntity<CommuneResponse> findByCode(@PathVariable(required = true) String code)
  {
    return service.findByCode(code);
  }
}
