package com.foodvilla.menu;

public class MenuItemBean {

	private String itemName;
	private String itemDescription;
	private double itemPrice;
	private String type;
	private String restaurantName;
	private String restaurantCategory;

	private MenuItem menuItem;

	public String getRestaurantName() {
		return restaurantName;
	}
	public String getRestaurantAddress() {
		return restaurantAddress;
	}
	private String restaurantAddress;

	private boolean valid;

	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;

	}
	public void setRestaurantAddress(String restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}
	public String getRestaurantCategory() {
		return restaurantCategory;
	}
	public void setRestaurantCategory(String restaurantCategory) {
		this.restaurantCategory = restaurantCategory;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public MenuItem getMenuItem() {
		return menuItem;
	}
	public void setMenuItem(MenuItem menuItem) {
		this.menuItem = menuItem;
	}

}
