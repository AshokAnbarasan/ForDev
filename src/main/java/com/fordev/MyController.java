package com.fordev;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping(value="/getmsg")
	public String getmsg() {
		return "this is for devops testing";
	}

}
