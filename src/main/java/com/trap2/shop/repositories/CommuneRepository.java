package com.trap2.shop.repositories;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trap2.shop.entities.Commune;

public interface CommuneRepository extends JpaRepository<Commune, String>{
  Set<Commune> findByArrondissement_Code(String code);
  Set<Commune> findBySectionCommunales_Code(String code);

}
