package com.npci.restaurantapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name="FoodItem")
public class FoodItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ItemID")
	private Integer itemId;
	
	
	@Column(name="RestaurantID")
	private Integer restaurantId;
	
	@Column(name="ItemType")
	private String itemType;
	
	@Column(name="ItemDescription")
	private String description;
	
	//@ManyToOne
	//private Restaurant restaurant;
	
	

}
