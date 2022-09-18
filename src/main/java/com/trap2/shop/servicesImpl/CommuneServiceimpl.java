package com.trap2.shop.servicesImpl;

import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;

import com.trap2.shop.dto.response.CommuneResponse;
import com.trap2.shop.dto.response.SectionCommunaleResponse;
import com.trap2.shop.entities.Commune;
import com.trap2.shop.repositories.CommuneRepository;
import com.trap2.shop.repositories.SectionCommunaleRepository;
import com.trap2.shop.services.CommuneService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
public class CommuneServiceimpl implements CommuneService
{
  private final CommuneRepository communeRepository;
  private final SectionCommunaleRepository sectionCommunaleRepository;

  public CommuneServiceimpl(CommuneRepository communeRepository, SectionCommunaleRepository sectionCommunaleRepository)
  {
    this.communeRepository = communeRepository;
    this.sectionCommunaleRepository = sectionCommunaleRepository;
  }

  @Override
  public ResponseEntity<Set<CommuneResponse>> findByArrondissement(String code)
  {
    Set<CommuneResponse> communes = communeRepository.findByArrondissement_Code(code).stream().map(CommuneResponse::new).collect(
      Collectors.toSet());
/*    Optional<Commune> commune = communes.stream().findFirst();
    Set<CommuneResponse> communeResponses = communes.stream().map(CommuneResponse::new)
      .peek(item -> item.setSectionCommunales(addSectionCommunales(item.getCode(), commune.get())))
      .collect(Collectors.toSet());*/
    return ResponseEntity.ok(communes);
  }

  @Override
  public ResponseEntity<CommuneResponse> findByCode(String code)
  {
    CommuneResponse response = communeRepository.findById(code).map(CommuneResponse::new).get();
    return  ResponseEntity.ok(response);
  }

  private Set<SectionCommunaleResponse> addSectionCommunales(String code, Commune commune)
  {
    if (StringUtils.equals(code, commune.getCode()))
    {
      return sectionCommunaleRepository.findByCommune_Code(
          commune.getCode())
        .stream().map(SectionCommunaleResponse::new).collect(Collectors.toSet());
    }
    else
    {
      return Collections.emptySet();
    }
  }
}
