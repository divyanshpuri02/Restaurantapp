package com.npci.restaurantapp.services;

import java.util.List;
import java.util.stream.Stream;

import com.npci.restaurantapp.entity.Comment;
import com.npci.restaurantapp.entity.FoodItem;
import com.npci.restaurantapp.entity.Restaurant;

public interface IRestaurantServices {

	 Restaurant newRestaurant(Restaurant restaurant);

	 FoodItem newFoodItem(FoodItem fooditem);

	FoodItem updateFood(FoodItem fooditem);

	 String cutoutFoodItem(Integer itemID);

	 Comment newComment(Comment comment);
	 
	 List<Comment> Comments();

	 List<Comment> Comments(Integer restID);

	 Stream<List<FoodItem>> getByfirstSNameOrCityOrStateOrPincode(String sName, String city, String state, Integer pincode);

	


	
}
