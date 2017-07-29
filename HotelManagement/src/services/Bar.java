package services;

import java.sql.Time;
import java.util.Date;

import bar.BarConsummables;

public class Bar {

	private String serviceIdentifer;
	private String serviceDescription;
	private int barSerialNumber;
	private int totalCost;
	private int barWorkers;
	private Time barStarttime;
	private Time barEndtime;
	private int customersServed;
	private Date barDate;
	private BarConsummables consummables;

	public String getServiceIdentifer() {
		return serviceIdentifer;
	}

	public void setServiceIdentifer(String serviceIdentifer) {
		this.serviceIdentifer = serviceIdentifer;
	}

	public String getServiceDescription() {
		return serviceDescription;
	}

	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}

	public int getBarSerialNumber() {
		return barSerialNumber;
	}

	public void setBarSerialNumber(int barSerialNumber) {
		this.barSerialNumber = barSerialNumber;
	}

	public int getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}

	public int getBarWorkers() {
		return barWorkers;
	}

	public void setBarWorkers(int barWorkers) {
		this.barWorkers = barWorkers;
	}

	public Time getBarStarttime() {
		return barStarttime;
	}

	public void setBarStarttime(Time barStarttime) {
		this.barStarttime = barStarttime;
	}

	public Time getBarEndtime() {
		return barEndtime;
	}

	public void setBarEndtime(Time barEndtime) {
		this.barEndtime = barEndtime;
	}

	public int getCustomersServed() {
		return customersServed;
	}

	public void setCustomersServed(int customersServed) {
		this.customersServed = customersServed;
	}

	public Date getBarDate() {
		return barDate;
	}

	public void setBarDate(Date barDate) {
		this.barDate = barDate;
	}

	public BarConsummables getConsummables() {
		return consummables;
	}

	public void setConsummables(BarConsummables consummables) {
		this.consummables = consummables;
	}

}
