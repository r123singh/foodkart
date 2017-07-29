package com.foodvilla.orders;

import java.util.Vector;

public class OrderItemsBeans {

	private Vector<OrderItemBean> orderItems;
	private int allorderItemsid;
	private long orderid;
	private FoodOrder foodOrder;



	private boolean valid;
	private String errorMessage;
	public Vector<OrderItemBean> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(Vector<OrderItemBean> orderItems) {
		this.orderItems = orderItems;
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public int getAllorderItemsid() {
		return allorderItemsid;
	}
	public void setAllorderItemsid(int allorderItemsid) {
		this.allorderItemsid = allorderItemsid;
	}
	public long getOrderid() {
		return orderid;
	}
	public void setOrderid(long orderid) {
		this.orderid = orderid;
	}
	public FoodOrder getFoodOrder() {
		return foodOrder;
	}
	public void setFoodOrder(FoodOrder foodOrder) {
		this.foodOrder = foodOrder;
	}

}
