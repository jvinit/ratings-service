package com.microservices.ratingservice.model;

import java.util.List;

public class UserRatings {

	private List<Rating> rating;

	public List<Rating> getRating() {
		return rating;
	}

	public void setRating(List<Rating> rating) {
		this.rating = rating;
	}
}
