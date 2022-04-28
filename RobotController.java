package com.example.demo.t;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RobotController {
	@Autowired
	RobotService robotService;
	
	@RequestMapping("/robot/balance")
	public String getBatteryBalance(@RequestParam("weight") int weight,@RequestParam("walkedDistance") int distance) {
		return robotService.getBatteryBalance(distance,weight);
	}
	
	
	
}
