package com.foodvilla.orders;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "foodorder")
public class FoodOrder implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long orderid;

	private double totalPrice;

	private double totalTax;

	private Date orderDate;

	private String deliveryAddress;

	private String restaurantAddress;

	private String restaurantName;

	private String status;

	public FoodOrder() {
	}

	public FoodOrder(long orderid, double totalPrice, double totalTax, Date orderDate, String deliveryAddress, String restaurantAddress, String restaurantName, String status) {
		super();
		this.orderid = orderid;
		this.totalPrice = totalPrice;
		this.totalTax = totalTax;
		this.orderDate = orderDate;
		this.deliveryAddress = deliveryAddress;
		this.restaurantAddress = restaurantAddress;
		this.restaurantName = restaurantName;
		this.status = status;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "order_id")
	public long getOrderid() {
		return orderid;
	}

	public void setOrderid(long orderid) {
		this.orderid = orderid;
	}

	@Column(name = "totalprice")
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Column(name = "totaltax")
	public double getTotalTax() {
		return totalTax;
	}
	public void setTotalTax(double totalTax) {
		this.totalTax = totalTax;
	}

	@Column(name = "orderdate")
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	@Column(name = "deliveryaddress")
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	@Column(name = "restaurantaddress")
	public String getRestaurantAddress() {
		return restaurantAddress;
	}
	public void setRestaurantAddress(String restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}

	@Column(name = "restaurantname")
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	@Column(name = "status")
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
