package com.foodvilla.orders;

import java.util.List;

public class FoodOrdersBean {

	private List<FoodOrder> foodOrders;
	private boolean valid;

	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	public List<FoodOrder> getFoodOrders() {
		return foodOrders;
	}
	public void setFoodOrders(List<FoodOrder> foodOrders) {
		this.foodOrders = foodOrders;
	}

}
