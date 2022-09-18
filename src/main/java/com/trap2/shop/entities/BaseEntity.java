package com.trap2.shop.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntity implements Serializable
{
  @Id
  @Basic
  @Column(name = "CODE", length = 20)
  private String code;
  @Basic
  @Column(name = "NAME")
  private String name;

  public BaseEntity(String code)
  {
    this.code = code;
  }
}
