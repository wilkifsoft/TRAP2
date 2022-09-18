package com.trap2.shop.services;

import java.util.Set;

import org.springframework.http.ResponseEntity;

import com.trap2.shop.dto.response.SectionCommunaleResponse;

public interface SectionCommunaleService
{
  ResponseEntity<Set<SectionCommunaleResponse>> findByCommune(String code);
}
