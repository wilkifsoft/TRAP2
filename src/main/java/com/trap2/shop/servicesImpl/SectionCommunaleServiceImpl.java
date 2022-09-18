package com.trap2.shop.servicesImpl;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;

import com.trap2.shop.dto.response.SectionCommunaleResponse;
import com.trap2.shop.repositories.SectionCommunaleRepository;
import com.trap2.shop.services.SectionCommunaleService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SectionCommunaleServiceImpl implements SectionCommunaleService
{
 private final SectionCommunaleRepository sectionCommunaleRepository;

  public SectionCommunaleServiceImpl(SectionCommunaleRepository sectionCommunaleRepository)
  {
    this.sectionCommunaleRepository = sectionCommunaleRepository;
  }

  @Override
  public ResponseEntity<Set<SectionCommunaleResponse>> findByCommune(String code)
  {
    Set<SectionCommunaleResponse> responses=sectionCommunaleRepository.findByCommune_Code(code)
      .stream().map(SectionCommunaleResponse::new).collect(Collectors.toSet());
    return ResponseEntity.ok(responses);
  }
}
