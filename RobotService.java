package com.example.demo.t;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RobotService {

	@Autowired
	Robot robot ;

	@Value("${robot.walk.distance}")
	int walkingDistance ;
	
	
	@Value("${robot.discharge.rate}")
	int dischargeRate ;
	
	
	public String getBatteryBalance(int walkedDistance,int weight) {
		int balance ;
		if(weight>15) {
			return "Overweight";
		}
		else {
			balance= (int) (robot.charge-((weight*0.03)+1)/7*walkedDistance);
			System.out.println();
		if(balance<=0) {	
			return "Insufficient battery task can't be completed";
		}
		else {
			robot.charge=balance;
			return "Robot Battery Balance "+balance;
		}
		}
		
	};	
}
