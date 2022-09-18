package com.trap2.shop.repositories;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trap2.shop.entities.SectionCommunale;

public interface SectionCommunaleRepository extends JpaRepository<SectionCommunale, String>
{

  Set<SectionCommunale> findByCommune_Code(String commune);
}
