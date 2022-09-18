package com.trap2.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trap2.shop.entities.Comments;

public interface CommentsRepository extends JpaRepository<Comments, Long>
{
  //Page<Comments> findByShop_Id(Long id);
}
