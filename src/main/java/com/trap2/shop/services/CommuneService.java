package com.trap2.shop.services;

import java.util.Set;

import org.springframework.http.ResponseEntity;

import com.trap2.shop.dto.response.CommuneResponse;

public interface CommuneService
{
  ResponseEntity<Set<CommuneResponse>> findByArrondissement(String code);
  ResponseEntity<CommuneResponse> findByCode(String code);
}
