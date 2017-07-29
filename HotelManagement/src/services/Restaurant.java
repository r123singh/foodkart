package services;

import java.sql.Time;
import java.util.Date;

import restaurant.RestaurantConsummables;
import restaurant.RestaurantMenu;

public class Restaurant {

	private String serviceName;
	private String serviceIdentifier;
	private int restaurantSerialNumber;
	private String serviceDescription;
	private int restaurantWorkers;
	private int totalCost;
	private Date restaurantDate;
	private Time restaurantStart;
	private Time restaurantClose;
	private RestaurantConsummables consummables;
	private RestaurantMenu menu;

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceIdentifier() {
		return serviceIdentifier;
	}

	public void setServiceIdentifier(String serviceIdentifier) {
		this.serviceIdentifier = serviceIdentifier;
	}

	public int getRestaurantSerialNumber() {
		return restaurantSerialNumber;
	}

	public void setRestaurantSerialNumber(int restaurantSerialNumber) {
		this.restaurantSerialNumber = restaurantSerialNumber;
	}

	public String getServiceDescription() {
		return serviceDescription;
	}

	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}

	public int getRestaurantWorkers() {
		return restaurantWorkers;
	}

	public void setRestaurantWorkers(int restaurantWorkers) {
		this.restaurantWorkers = restaurantWorkers;
	}

	public int getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}

	public Date getRestaurantDate() {
		return restaurantDate;
	}

	public void setRestaurantDate(Date restaurantDate) {
		this.restaurantDate = restaurantDate;
	}

	public Time getRestaurantStart() {
		return restaurantStart;
	}

	public void setRestaurantStart(Time restaurantStart) {
		this.restaurantStart = restaurantStart;
	}

	public Time getRestaurantClose() {
		return restaurantClose;
	}

	public void setRestaurantClose(Time restaurantClose) {
		this.restaurantClose = restaurantClose;
	}

	public RestaurantConsummables getConsummables() {
		return consummables;
	}

	public void setConsummables(RestaurantConsummables consummables) {
		this.consummables = consummables;
	}

	public RestaurantMenu getMenu() {
		return menu;
	}

	public void setMenu(RestaurantMenu menu) {
		this.menu = menu;
	}

}
