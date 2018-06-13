package com.spring.routes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.spring.routes.entity.ResponseEntity;
import com.spring.routes.service.IRouteFindService;

@RestController
@RequestMapping("/RouteFinder")
public class RouteFindController {
	
	private static final Logger logger = LogManager.getLogger(RouteFindController.class);
	
	
	@Autowired
	private IRouteFindService irouteFindService;
	
	@Autowired
	private ResponseEntity responseEntity;
	
	@RequestMapping(value="/login",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity login(){
		responseEntity.setResponse("Login Successfully Completed!!!!");
		logger.info("Loing API is validation api to check spring boot up and runing or not");
		return responseEntity;
	}
	
	@RequestMapping(value="/findRoute",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity findRoute(@RequestParam("source") String source, @RequestParam("destination") String destination) {
		logger.info("RouteFindController >> FindRoute process started execution");
		System.out.println("Source >> "+source+" << Destination >>"+destination);
		if(irouteFindService.findRoute(source,destination)){
			responseEntity.setResponse("Yes");
		}else {
			responseEntity.setResponse("No");
		}
		logger.info("RouteFindController >> FindRoute process completed execution");
		return responseEntity;
	}
	
}

