package com.microservices.ratingservice.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.ratingservice.model.Rating;
import com.microservices.ratingservice.model.UserRatings;

@RestController
@RequestMapping("/ratings/api")
public class RatingsController {

	@GetMapping("users/{userId}")
	public UserRatings getUserRatings(@PathVariable String userId) {
		List<Rating> ratings = new ArrayList<>(Arrays.asList(
					new Rating("100", 3.0),
					new Rating("200", 4.0),
					new Rating("600", 2.5)
				));
		
		UserRatings userRatings = new UserRatings();
		userRatings.setRating(ratings);
		
		return userRatings;
	}
	
}
