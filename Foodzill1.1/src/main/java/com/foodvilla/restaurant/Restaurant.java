package com.foodvilla.restaurant;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "restaurant")
public class Restaurant {
	private long id;
	private String name;
	private String address;
	private String location;
	private String category;
	private int esitmatedtime;
	private Date starttime;
	private Date closetime;
	private String deliverymode;
	private String paymentmode;
	private Date created;
	private double deliverycharges;
	private double minimumordercharges;
	private String foodcategory;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getEsitmatedtime() {
		return esitmatedtime;
	}
	public void setEsitmatedtime(int esitmatedtime) {
		this.esitmatedtime = esitmatedtime;
	}
	public Date getStarttime() {
		return starttime;
	}
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}
	public Date getClosetime() {
		return closetime;
	}
	public void setClosetime(Date closetime) {
		this.closetime = closetime;
	}
	public String getDeliverymode() {
		return deliverymode;
	}
	public void setDeliverymode(String deliverymode) {
		this.deliverymode = deliverymode;
	}
	public String getPaymentmode() {
		return paymentmode;
	}
	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public double getDeliverycharges() {
		return deliverycharges;
	}
	public void setDeliverycharges(double deliverycharges) {
		this.deliverycharges = deliverycharges;
	}
	public double getMinimumordercharges() {
		return minimumordercharges;
	}
	public void setMinimumordercharges(double minimumordercharges) {
		this.minimumordercharges = minimumordercharges;
	}
	public String getFoodcategory() {
		return foodcategory;
	}
	public void setFoodcategory(String foodcategory) {
		this.foodcategory = foodcategory;
	}

}
