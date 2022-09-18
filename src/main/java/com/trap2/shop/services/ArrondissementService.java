package com.trap2.shop.services;

import java.util.Set;

import org.springframework.http.ResponseEntity;

import com.trap2.shop.dto.response.ArrondissementResponse;

public interface ArrondissementService
{
  ResponseEntity<Set<ArrondissementResponse>> findByDeprtment(String code);
  ResponseEntity<ArrondissementResponse> findByCode(String code);
}
