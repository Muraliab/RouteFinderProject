package com.spring.routes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages="com.spring.routes")
public class RoutesServerApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(RoutesServerApplication.class, args);
	}
}
