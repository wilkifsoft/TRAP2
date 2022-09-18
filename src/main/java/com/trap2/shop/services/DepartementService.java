package com.trap2.shop.services;

import java.util.Set;

import org.springframework.http.ResponseEntity;

import com.trap2.shop.dto.response.DepartmentResponse;
public interface DepartementService
{
  ResponseEntity<Set<DepartmentResponse>> getAll();
  ResponseEntity<Set<DepartmentResponse>> findByName(String name);
  ResponseEntity<DepartmentResponse> findByCode(String code);
}
