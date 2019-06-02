package com.order.wishlist.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class WishlistControllerImpl implements WishlistController{

	@Override
	public String[] getWishlist(String username) {
		return new String[] {
		    	"book", "food", "drink"
		    };
	}

}
