package com.trap2.shop.repositories;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trap2.shop.entities.Departement;

public interface DepartementRepository extends JpaRepository<Departement, String>
{
  Set<Departement> findByName(String name);
}
