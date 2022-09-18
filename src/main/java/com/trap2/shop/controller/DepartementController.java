package com.trap2.shop.controller;

import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trap2.shop.dto.response.DepartmentResponse;
import com.trap2.shop.services.DepartementService;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/shop-service/departement/")
@Slf4j
public class DepartementController
{
  private final DepartementService service;

  public DepartementController(DepartementService service)
  {
    this.service = service;
  }

  //ApiOperation("Method to get all the departments")
  @GetMapping("getAll")
  public ResponseEntity<Set<DepartmentResponse>> getAll()
  {
    return service.getAll();
  }

  //@ApiOperation("Method to get the department by it's id")
  @GetMapping("findByCode/{code}")
  public ResponseEntity<DepartmentResponse> findByCode(/*@Parameter(name = "code",example = "SE0001, HK0002")*/ @PathVariable(required = true) String code)
  {
    return service.findByCode(code);
  }
}
