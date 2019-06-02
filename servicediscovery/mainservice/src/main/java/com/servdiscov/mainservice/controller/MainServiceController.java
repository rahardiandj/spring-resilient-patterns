package com.servdiscov.mainservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainServiceController {
	
	RestTemplate restTemplate = new RestTemplate();
	
//	@Autowired
//	DiscoveryClient client;
	
	@Autowired
	LoadBalancerClient client;
	
	@GetMapping("/products")
	public String[] service() {
		
//		ServiceInstance serviceInstance =
//		client.getInstances("main-product")
//		.stream()
//		.findFirst()
//		.orElseThrow(()-> new RuntimeException("main product service not found"));
		
		ServiceInstance serviceInstance = client.choose("main-product");
		org.apache.commons.lang.Validate.notNull(
		serviceInstance, "main product service not found");
		
		String url = serviceInstance.getUri().toString() + "/rest/product/main";
		
//		String url = "http://localhost:8098/rest/product/main";
		return restTemplate.getForObject(url, String[].class);
	}

}
