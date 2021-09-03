package com.madhis.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

	@GetMapping("/userServiceFallBack")
	public String userServiceFallBackMethod(){
		return "User Service taking  longer then expectt3e" +
			"Please try again later";
	}
	
	@GetMapping("/depatmentServiceFallBack")
	public String departmentServiceFallBackMethod(){
		return "Department Service taking  longer then expectt3e" +
			"Please try again later";
	}
}
