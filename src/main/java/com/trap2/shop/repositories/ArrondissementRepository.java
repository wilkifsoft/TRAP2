package com.trap2.shop.repositories;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trap2.shop.entities.Arrondissement;

public interface ArrondissementRepository extends JpaRepository<Arrondissement, String>{

	Set<Arrondissement> findByDepartement_Code(String  code);
}
