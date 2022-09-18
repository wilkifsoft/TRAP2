package com.trap2.shop.servicesImpl;

import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;

import com.trap2.shop.dto.response.ArrondissementResponse;
import com.trap2.shop.dto.response.SectionCommunaleResponse;
import com.trap2.shop.entities.Commune;
import com.trap2.shop.repositories.ArrondissementRepository;
import com.trap2.shop.repositories.CommuneRepository;
import com.trap2.shop.repositories.SectionCommunaleRepository;
import com.trap2.shop.services.ArrondissementService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
public class ArrondissementServiceImpl implements ArrondissementService
{
  private final ArrondissementRepository arrondissementRepository;
  private final CommuneRepository communeRepository;
  private final SectionCommunaleRepository sectionCommunaleRepository;

  public ArrondissementServiceImpl(ArrondissementRepository arrondissementRepository,
    CommuneRepository communeRepository,
    SectionCommunaleRepository sectionCommunaleRepository)
  {
    this.arrondissementRepository = arrondissementRepository;
    this.communeRepository = communeRepository;
    this.sectionCommunaleRepository = sectionCommunaleRepository;
  }

  @Override
  public ResponseEntity<Set<ArrondissementResponse>> findByDeprtment(String code)
  {
    Set<ArrondissementResponse> arrondissements = arrondissementRepository.findByDepartement_Code(code).stream().map(ArrondissementResponse::new).collect(
      Collectors.toSet());
    return ResponseEntity.ok(arrondissements);
  }

  @Override
  public ResponseEntity<ArrondissementResponse> findByCode(String code)
  {
    ArrondissementResponse response = arrondissementRepository.findById(code).map(ArrondissementResponse::new).get();
    return ResponseEntity.ok(response);
  }

/*  private  Set<ArrondissementResponse> addCommunes(String code, Arrondissement arr){
    Set<Commune> communes= communeRepository.findByArrondissement_Code(arr.getCode());
    Optional<Commune> commune = communes.stream().findFirst();

    if(StringUtils.equals(code, arr.getCode() ))
    {     Set<CommuneResponse> communeResponses= communes
      .stream().map(CommuneResponse::new)
      .map(item ->{
        item.setSectionCommunales(addSectionCommunales(item.getCode(), commune.get()));
        return item;
      })
      .collect(Collectors.toSet());
      return communeResponses;
    }else{
      return Collections.emptySet();
    }
  }*/

  private  Set<SectionCommunaleResponse> addSectionCommunales(String code, Commune commune){
    if(StringUtils.equals(code, commune.getCode() ))
    {     Set<SectionCommunaleResponse> sectionCommunaleResponses= sectionCommunaleRepository.findByCommune_Code(commune.getCode())
      .stream().map(SectionCommunaleResponse::new).collect(Collectors.toSet());
      return sectionCommunaleResponses;
    }else{
      return Collections.emptySet();
    }
  }
}
