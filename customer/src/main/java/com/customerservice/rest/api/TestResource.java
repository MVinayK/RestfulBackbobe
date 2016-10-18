package com.customerservice.rest.api;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class TestResource {
	
	@RequestMapping("/")
	public String home(){
		return "welcome";
	}
	
	@RequestMapping(value="/greet", method= RequestMethod.GET, produces=MediaType.ALL_VALUE)
	public String getGreting(){
		return "welcome to spring boot";
	}
}
