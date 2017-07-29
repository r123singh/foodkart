package com.foodvilla.menu;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.CascadeType;

import com.foodvilla.restaurant.Restaurant;

@Entity
@Table(name = "menuitem")
public class MenuItem {

	private long id;
	private String name;
	private String description;
	private double price;
	private String type;
	private Restaurant restaurant;

	public MenuItem(long id, String name, String description, double price, String type, Restaurant restaurant) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.type = type;
		this.restaurant = restaurant;
	}

	public MenuItem(Restaurant restaurant) {
		// TODO Auto-generated constructor stub
		this.restaurant = restaurant;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "price")
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Column(name = "type")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="restaurant_id")
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

}
