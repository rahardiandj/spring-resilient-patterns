package com.order.wishlistservice.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class WishlistService {
	
	@HystrixCommand(fallbackMethod="defaultWishlist")
	public String getWishlist(String username) {
		return new RestTemplate()
		          .getForObject("http://localhost:9090/wishlist/{username}", 
		          String.class, username);
		
	}
	
	private String defaultWishlist(String username) {
        return "smartphone";
    }

}
