package com.microservice.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.limitsservice.bean.LimitConfiguration;


@EnableAutoConfiguration
@RestController
public class LimitsConfigurationController {
	@Autowired
    private Configuration configuration;
	@GetMapping("/limits") 
	public LimitConfiguration retriveLimitsFromConfiguration() {
		return new LimitConfiguration(configuration.getMaximum(),
				configuration.getMinimum());
		
		
	}
}
