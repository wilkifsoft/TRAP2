package com.trap2.shop.servicesImpl;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;

import com.trap2.shop.dto.response.DepartmentResponse;
import com.trap2.shop.repositories.DepartementRepository;
import com.trap2.shop.services.DepartementService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DepartementServiceImpl implements DepartementService
{
  private final DepartementRepository departementRepository;

  public DepartementServiceImpl(DepartementRepository departementRepository)
  {
    this.departementRepository = departementRepository;
  }

  @Override
  public ResponseEntity<Set<DepartmentResponse>> getAll()
  {
    Set<DepartmentResponse> responses = departementRepository.findAll()
      .stream().map(DepartmentResponse::new).collect(Collectors.toSet());
    return ResponseEntity.ok(responses);
  }

  @Override
  public ResponseEntity<Set<DepartmentResponse>> findByName(String name)
  {
    Set<DepartmentResponse> responses = departementRepository.findByName(name)
      .stream().map(DepartmentResponse::new).collect(Collectors.toSet());
    return ResponseEntity.ok(responses);
  }

  @Override
  public ResponseEntity<DepartmentResponse> findByCode(String code)
  {
    DepartmentResponse response = departementRepository.findById(code).map(DepartmentResponse::new).get();
    return ResponseEntity.ok(response);
  }

}
