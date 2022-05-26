package com.npci.restaurantapp.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name="Restaurant")
public class Restaurant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="RestaurantID")
	private Integer restaurantId;
	
	@Column(name="DoorNumber")
	private Integer doorNo;
	
	@Column(name="StreetName")
	private String sName;
	
	@Column(name="City")
	private String city;
	
	@Column(name="State")
	private String state;
	
	@Column(name="PinCode")
	private Integer pincode;
	
//	@OneToMany(mappedBy = "restaurant")
//	private List<FoodItem> foodItems;
	
	//@OneToMany(mappedBy = "restaurant")
	//private List<Comment> comments;
 	
}
