package services;

import java.util.Date;

import breakfast.BreakfastConsummables;

public class Breakfast {
	
	private String serviceDescription;
	private String serviceIdentifier;
	private String serviceName;
	private int breakfastSerialNumber;
	private Date breakfastTime;
	private int totalCost;
	private int breakfastWorkers;
	private BreakfastConsummables consummables;
	
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
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public int getBreakfastSerialNumber() {
		return breakfastSerialNumber;
	}
	public void setBreakfastSerialNumber(int breakfastSerialNumber) {
		this.breakfastSerialNumber = breakfastSerialNumber;
	}
	public Date getBreakfastTime() {
		return breakfastTime;
	}
	public void setBreakfastTime(Date breakfastTime) {
		this.breakfastTime = breakfastTime;
	}
	public int getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}
	public int getBreakfastWorkers() {
		return breakfastWorkers;
	}
	public void setBreakfastWorkers(int breakfastWorkers) {
		this.breakfastWorkers = breakfastWorkers;
	}
	public BreakfastConsummables getConsummables() {
		return consummables;
	}
	public void setConsummables(BreakfastConsummables consummables) {
		this.consummables = consummables;
	}


}
