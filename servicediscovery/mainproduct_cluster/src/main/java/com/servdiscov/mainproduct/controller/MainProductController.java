package com.servdiscov.mainproduct.controller;

import org.slf4j.LoggerFactory;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("rest/product")
public class MainProductController {

  RestTemplate restTemplate = new RestTemplate();

  @GetMapping("/main")
  public String[] main() {
	LoggerFactory.getLogger(Endpoint.class).info("main product called");
    return new String[] {
    	"flight", "accomodation", "movie"
    };
  }
}
