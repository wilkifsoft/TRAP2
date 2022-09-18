package com.trap2.shop.entities;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class AbstractAuditingEntity implements Serializable
{
  @Serial
  private static final long serialVersionUID = 1L;

  @CreatedBy
  @Column(name = "CREATED_BY", nullable = false, length = 50, updatable = false)
  @JsonIgnore
  protected String createdBy = "ADMIN";

  @CreatedDate
  @Column(name = "CREATED_DATE", updatable = false)
  @JsonIgnore
  protected Instant createdDate = Instant.now();

  @LastModifiedBy
  @Column(name = "LAST_MODIFIED_BY", length = 50)
  @JsonIgnore
  protected String lastModifiedBy;

  @LastModifiedDate
  @Column(name = "LAST_MODIFIED_DATE")
  @JsonIgnore
  protected Instant lastModifiedDate = Instant.now();

}
