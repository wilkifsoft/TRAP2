package com.trap2.shop.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trap2.shop.entities.Branches;

public interface BranchesRepository extends JpaRepository<Branches, Long>
{

  List<Branches> findByShop_Id(Long id);
}
