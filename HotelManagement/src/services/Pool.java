package services;

import java.sql.Date;
import java.sql.Time;

import pool.PoolConsummables;

public class Pool {

	private String serviceName;
	private String serivceIdentifier;
	private int poolSerialNumber;
	private int poolEmployees;
	private Time poolStarttime;
	private Time poolEndtime;
	private PoolConsummables consummables;
	private Date poolDate;

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getSerivceIdentifier() {
		return serivceIdentifier;
	}

	public void setSerivceIdentifier(String serivceIdentifier) {
		this.serivceIdentifier = serivceIdentifier;
	}

	public int getPoolSerialNumber() {
		return poolSerialNumber;
	}

	public void setPoolSerialNumber(int poolSerialNumber) {
		this.poolSerialNumber = poolSerialNumber;
	}

	public int getPoolEmployees() {
		return poolEmployees;
	}

	public void setPoolEmployees(int poolEmployees) {
		this.poolEmployees = poolEmployees;
	}

	public Time getPoolStarttime() {
		return poolStarttime;
	}

	public void setPoolStarttime(Time poolStarttime) {
		this.poolStarttime = poolStarttime;
	}

	public Time getPoolEndtime() {
		return poolEndtime;
	}

	public void setPoolEndtime(Time poolEndtime) {
		this.poolEndtime = poolEndtime;
	}

	public PoolConsummables getConsummables() {
		return consummables;
	}

	public void setConsummables(PoolConsummables consummables) {
		this.consummables = consummables;
	}

	public Date getPoolDate() {
		return poolDate;
	}

	public void setPoolDate(Date poolDate) {
		this.poolDate = poolDate;
	}

}
