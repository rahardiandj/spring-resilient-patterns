package com.servdisc.product.endpoint;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Component
@Path("/city")
public class Endpoint {

  @Produces({MediaType.APPLICATION_JSON})
  @GET
  @Path("/capital")
  public String[] capital() {
    return new String[] {
      "Arnhem", "Assen", "Den Bosch", "Den Haag",
      "Groningen", "Haarlem", "Leeuwarden", "Lelystad",
      "Maastricht", "Middelburg", "Utrecht", "Zwolle" };
  }
}


