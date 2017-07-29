package emplyee;

import java.util.Date;

import services.HotelService;

public class Employee {

	private String employeeName;
	private String employeeIdentifier;
	private HotelService service;
	private Date joiningDate;
	private EmployeeDesignation designation;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeIdentifier() {
		return employeeIdentifier;
	}

	public void setEmployeeIdentifier(String employeeIdentifier) {
		this.employeeIdentifier = employeeIdentifier;
	}

	public HotelService getService() {
		return service;
	}

	public void setService(HotelService service) {
		this.service = service;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public EmployeeDesignation getDesignation() {
		return designation;
	}

	public void setDesignation(EmployeeDesignation designation) {
		this.designation = designation;
	}

}
