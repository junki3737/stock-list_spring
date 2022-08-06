package com.example.stocklist.model;

import lombok.Getter;

@Getter
public class HealthCheck {
  private String healthcheck;

  public HealthCheck() {
    healthcheck = "ok";
  }
}
