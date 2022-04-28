package com.example.demo.t;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class Robot {

	@Value("${robot.charge}")
	int charge;
	@Value("${robot.threshold.weight}")
	int thresholdWeight;
	


	
	
	public int getCharge() {
		return charge;
	}
	public void setCharge(int charge) {
		this.charge = charge;
	}
	public int getThresholdWeight() {
		return thresholdWeight;
	}
	public void setThresholdWeight(int thresholdWeight) {
		this.thresholdWeight = thresholdWeight;
	}

	}
