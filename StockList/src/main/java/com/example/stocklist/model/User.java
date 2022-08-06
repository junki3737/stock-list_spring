package com.example.stocklist.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User extends BaseEntity {
  @Id
  @GeneratedValue
  private Integer id;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private String email;
}
