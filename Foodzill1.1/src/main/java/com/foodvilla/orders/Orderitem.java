package com.foodvilla.orders;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import javax.persistence.CascadeType;
@Entity
@Table(name = "orderitem")
public class Orderitem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long orderitemid;

	private String name;

	private String description;

	private String remarks;

	private double price;

	private int qunatity;

	private int orderitemsid;

	private FoodOrder foodOrder;

	public Orderitem(long id, String name, String description, String remarks, double price, int qunatity, int orderitemsid, FoodOrder foodOrder) {
		super();
		this.setOrderitemid(id);
		this.name = name;
		this.description = description;
		this.remarks = remarks;
		this.price = price;
		this.qunatity = qunatity;
		this.orderitemsid = orderitemsid;
		this.foodOrder = foodOrder;
	}

	public Orderitem(FoodOrder foodOrder) {
		this.foodOrder = foodOrder;
	}
	public Orderitem() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "orderitem_id")
	public long getOrderitemid() {
		return orderitemid;
	}

	public void setOrderitemid(long orderitemid) {
		this.orderitemid = orderitemid;
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

	@Column(name = "remarks")
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column(name = "price")
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Column(name = "quantity")
	public int getQunatity() {
		return qunatity;
	}
	public void setQunatity(int qunatity) {
		this.qunatity = qunatity;
	}

	@Column(name = "orderitems_id")
	public int getOrderitemsid() {
		return orderitemsid;
	}
	public void setOrderitemsid(int orderitemsid) {
		this.orderitemsid = orderitemsid;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "order_id")
	public FoodOrder getOrder() {
		return foodOrder;
	}
	public void setOrder(FoodOrder foodOrder) {
		this.foodOrder = foodOrder;
	}

}
