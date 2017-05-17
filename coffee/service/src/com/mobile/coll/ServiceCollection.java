package com.mobile.coll;

import com.mobile.exp.UnavailableServiceException;
import com.my.service.DataService;
import com.my.service.SMSService;
import com.my.service.Service;

public class ServiceCollection {
	private static Service availableServices[] = new Service[6];
	

	static {
		availableServices[0] = new DataService();
		availableServices[0].setServiceID(1);
		availableServices[0].setServiceName("3G-1GB");
		availableServices[0].setMonthlyRent(200);
		availableServices[0].setFreeUnits(100000);

		availableServices[1] = new DataService();
		availableServices[1].setServiceID(2);
		availableServices[1].setServiceName("3G-2GB");
		availableServices[1].setMonthlyRent(400);
		availableServices[1].setFreeUnits(200000);

		availableServices[2] = new DataService();
		availableServices[2].setServiceID(3);
		availableServices[2].setServiceName("2G-1GB");
		availableServices[2].setMonthlyRent(150);
		availableServices[2].setFreeUnits(100000);

		availableServices[3] = new SMSService();
		availableServices[3].setServiceID(4);
		availableServices[3].setServiceName("SMS-100");
		availableServices[3].setMonthlyRent(25);
		availableServices[3].setFreeUnits(100);

		availableServices[4] = new SMSService();
		availableServices[4].setServiceID(5);
		availableServices[4].setServiceName("SMS-300");
		availableServices[4].setMonthlyRent(60);
		availableServices[4].setFreeUnits(300);

	}

	static Service getService(int serviceID) {

		Service avail;
		System.out.println("id="+serviceID);
		if (serviceID > 0 && serviceID < 4) {
			avail = availableServices[serviceID-1];
			return avail;
		} else if (serviceID > 3 && serviceID < 6) {
			avail = availableServices[serviceID-1];
		return avail;
		} else {
			throw new UnavailableServiceException();
			
		}
	}
	

}
