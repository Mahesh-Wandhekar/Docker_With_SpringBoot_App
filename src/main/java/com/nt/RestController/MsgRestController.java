package com.nt.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	
	@GetMapping("/")
	public String msg() {		
		return "Welcome To Ashok It...! Learn Here Lead AnyWhere..!";
	}
	
}
