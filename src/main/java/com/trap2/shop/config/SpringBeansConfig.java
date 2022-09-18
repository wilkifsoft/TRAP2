package com.trap2.shop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.trap2.shop.repositories.ArrondissementRepository;
import com.trap2.shop.repositories.BranchesRepository;
import com.trap2.shop.repositories.CommuneRepository;
import com.trap2.shop.repositories.DepartementRepository;
import com.trap2.shop.repositories.SectionCommunaleRepository;
import com.trap2.shop.repositories.ShopRepository;
import com.trap2.shop.servicesImpl.ArrondissementServiceImpl;
import com.trap2.shop.servicesImpl.CommuneServiceimpl;
import com.trap2.shop.servicesImpl.DepartementServiceImpl;
import com.trap2.shop.servicesImpl.SectionCommunaleServiceImpl;
import com.trap2.shop.servicesImpl.ShopServicesImpl;

@Configuration
public class SpringBeansConfig
{
  @Bean
  ArrondissementServiceImpl arrondissementServiceImpl(ArrondissementRepository arrondissementRepository,
    CommuneRepository communeRepository,
    SectionCommunaleRepository sectionCommunaleRepository)
  {
    return new ArrondissementServiceImpl(arrondissementRepository, communeRepository, sectionCommunaleRepository);
  }

  @Bean
  CommuneServiceimpl communeServiceimpl(CommuneRepository communeRepository,
    SectionCommunaleRepository sectionCommunaleRepository)
  {
    return new CommuneServiceimpl(communeRepository, sectionCommunaleRepository);
  }

  @Bean
  DepartementServiceImpl departementServiceImpl(DepartementRepository departementRepository)
  {
    return new DepartementServiceImpl(departementRepository);
  }

  @Bean
  SectionCommunaleServiceImpl sectionCommunaleServiceImpl(SectionCommunaleRepository sectionCommunaleRepository)
  {
    return new SectionCommunaleServiceImpl(sectionCommunaleRepository);
  }

  @Bean
  ShopServicesImpl shopServicesImpl(ShopRepository shopRepository, BranchesRepository branchesRepository)
  {
    return new ShopServicesImpl(shopRepository, branchesRepository);
  }
}
