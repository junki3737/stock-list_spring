package com.example.stocklist.controller;

import org.springframework.web.bind.annotation.*;
import com.example.stocklist.model.HealthCheck;

@RestController
@RequestMapping("/healthcheck")
public class HealthCheckController {

  @RequestMapping(method = RequestMethod.GET)
  public HealthCheck getHealthCheck() {
    HealthCheck hc = new HealthCheck();
    return hc;
  }
}