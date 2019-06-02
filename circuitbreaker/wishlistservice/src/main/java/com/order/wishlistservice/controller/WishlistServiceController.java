package com.order.wishlistservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.order.wishlistservice.service.WishlistService;

@Controller
public class WishlistServiceController {
	
	@Autowired
	WishlistService wishlistService;
	
	@GetMapping("/get-wishlist/{username}")
    public String getWishlist(Model model, @PathVariable("username") String username) {
        model.addAttribute("wishlist", wishlistService.getWishlist(username));
        return "wishlist-view";
    }

}
