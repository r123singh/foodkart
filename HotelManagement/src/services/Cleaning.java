package services;

import java.util.Date;

import cleaning.CleaningResources;

public class Cleaning {

	private int cleaningSerialNumber;
	private String description;
	private String cleaningName;
	private int numberCleaners;
	private int totalCost;
	private CleaningResources resources;
	private int roomsCleaned;
	private Date cleaningDate;

	public int getCleaningSerialNumber() {
		return cleaningSerialNumber;
	}

	public void setCleaningSerialNumber(int cleaningSerialNumber) {
		this.cleaningSerialNumber = cleaningSerialNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCleaningName() {
		return cleaningName;
	}

	public void setCleaningName(String cleaningName) {
		this.cleaningName = cleaningName;
	}

	public int getNumberCleaners() {
		return numberCleaners;
	}

	public void setNumberCleaners(int numberCleaners) {
		this.numberCleaners = numberCleaners;
	}

	public int getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}

	public CleaningResources getResources() {
		return resources;
	}

	public void setResources(CleaningResources resources) {
		this.resources = resources;
	}

	public int getRoomsCleaned() {
		return roomsCleaned;
	}

	public void setRoomsCleaned(int roomsCleaned) {
		this.roomsCleaned = roomsCleaned;
	}

	public Date getCleaningDate() {
		return cleaningDate;
	}

	public void setCleaningDate(Date cleaningDate) {
		this.cleaningDate = cleaningDate;
	}

}
