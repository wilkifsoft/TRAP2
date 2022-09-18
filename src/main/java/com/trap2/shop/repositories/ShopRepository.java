package com.trap2.shop.repositories;

import java.time.Instant;
import java.util.Collection;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.trap2.shop.entities.Shop;

public interface ShopRepository extends JpaRepository<Shop, Long>
{
  Page<Shop> findByStatusAndCategory_IdAndCreatedDateBetween(byte status, Long category, Instant fromDate, Instant toDate, Pageable pageable);
  Page<Shop> findByStatusInAndCategory_IdAndCreatedDateBetween(Collection<Byte> status, Long category, Instant fromDate, Instant toDate, Pageable pageable);
  Page<Shop> findByStatusAndCreatedDateBetween(byte status, Instant fromDate, Instant toDate, Pageable pageable);
  Page<Shop> findByStatusInAndCreatedDateBetween(Collection<Byte> status, Instant fromDate, Instant toDate, Pageable pageable);

  Page<Shop> findByCategory_Id(Long category, Pageable pageable);
  Page<Shop> findBySellerEmail(String sellerEmail, Pageable pageable);

}
