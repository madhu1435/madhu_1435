package com.transmission;

import java.util.ArrayList;

public class Transmission {
	
		
	
	
	int bandwidth;
	double signalNoiseRatio;
	int propagationTime;
	float crosstalk;
	public Transmission(int bandwidth, double signalNoiseRatio,
			int propagationTime, float crosstalk) {
		super();
		this.bandwidth = bandwidth;
		this.signalNoiseRatio = signalNoiseRatio;
		this.propagationTime = propagationTime;
		this.crosstalk = crosstalk;
	}
	
	
	
	
	

}
