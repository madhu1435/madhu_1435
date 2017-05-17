package com.my.service;

public abstract class  Service {

	private int  serviceID;
	private String serviceName;
	private int monthlyRent;
	private int freeUnits;
	
public int getServiceID() {
		return serviceID;
	}

	public void setServiceID(int serviceID) {
		this.serviceID = serviceID;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public int getMonthlyRent() {
		return monthlyRent;
	}

	public void setMonthlyRent(int monthlyRent) {
		this.monthlyRent = monthlyRent;
	}

	public int getFreeUnits() {
		return freeUnits;
	}

	public void setFreeUnits(int freeUnits) {
		this.freeUnits = freeUnits;
	}

public abstract int calculateCharge(int noOfUnits);

}
