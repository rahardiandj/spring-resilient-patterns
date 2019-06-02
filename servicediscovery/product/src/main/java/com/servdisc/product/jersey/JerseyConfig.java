package com.servdisc.product.jersey;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;


import com.servdisc.product.endpoint.Endpoint;

@Configuration
@ApplicationPath("/rest")
public class JerseyConfig extends ResourceConfig {

  public JerseyConfig() {
    register(Endpoint.class);
  }
}

