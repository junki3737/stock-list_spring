package com.example.stocklist.model;

import javax.persistence.MappedSuperclass;
import javax.persistence.Column;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;


@Getter
@Setter
@MappedSuperclass
public class BaseEntity {

  @Column(name = "created_at", updatable = false, nullable = false)
  private Date createdAt;

  @Column(name = "updated_at", nullable = false)
  private Date updatedAt;

  @Column(name = "discarded_at")
  private Date discardedAt;

  @PrePersist
  public void onPrePersist() {
    setCreatedAt(new Date());
    setUpdatedAt(new Date());
    setDiscardedAt(null);
  }

  @PreUpdate
  public void onPreUpdate() {
    setUpdatedAt(new Date());
  }
}