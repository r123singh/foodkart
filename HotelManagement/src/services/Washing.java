package services;

import java.util.Date;

import washing.WashingConsummables;

public class Washing {

	private String serviceDescription;
	private String serviceIdentifier;
	private int washingSerialNumber;
	private Date washingDate;
	private int itemsWashed;
	private int totalCost;
	private boolean washingComplete;
	private boolean washingIncomplete;
	private WashingConsummables consummablesUsed;
	private int washingWorkers;

	public String getServiceDescription() {
		return serviceDescription;
	}

	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}

	public String getServiceIdentifier() {
		return serviceIdentifier;
	}

	public void setServiceIdentifier(String serviceIdentifier) {
		this.serviceIdentifier = serviceIdentifier;
	}

	public int getWashingSerialNumber() {
		return washingSerialNumber;
	}

	public void setWashingSerialNumber(int washingSerialNumber) {
		this.washingSerialNumber = washingSerialNumber;
	}

	public Date getWashingDate() {
		return washingDate;
	}

	public void setWashingDate(Date washingDate) {
		this.washingDate = washingDate;
	}

	public int getItemsWashed() {
		return itemsWashed;
	}

	public void setItemsWashed(int itemsWashed) {
		this.itemsWashed = itemsWashed;
	}

	public int getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}

	public boolean isWashingComplete() {
		return washingComplete;
	}

	public void setWashingComplete(boolean washingComplete) {
		this.washingComplete = washingComplete;
	}

	public boolean isWashingIncomplete() {
		return washingIncomplete;
	}

	public void setWashingIncomplete(boolean washingIncomplete) {
		this.washingIncomplete = washingIncomplete;
	}

	public WashingConsummables getConsummablesUsed() {
		return consummablesUsed;
	}

	public void setConsummablesUsed(WashingConsummables consummablesUsed) {
		this.consummablesUsed = consummablesUsed;
	}

	public int getWashingWorkers() {
		return washingWorkers;
	}

	public void setWashingWorkers(int washingWorkers) {
		this.washingWorkers = washingWorkers;
	}

}
