package com.cg.fms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class FlightManagementSystemGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightManagementSystemGatewayApplication.class, args);
	}

}
