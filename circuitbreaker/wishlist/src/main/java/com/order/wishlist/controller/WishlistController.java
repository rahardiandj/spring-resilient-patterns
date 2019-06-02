package com.order.wishlist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface WishlistController {
	
	@GetMapping("/wishlist/{username}")
	String[] getWishlist(@PathVariable("username") String username);

}
