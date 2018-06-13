package com.spring.routes.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.routes.service.IRouteFindService;
import com.spring.routes.utils.RouteServiceUtility;

@Service
public class RouteFindServiceImpl implements IRouteFindService{

	private static final Logger logger = LogManager.getLogger(RouteFindServiceImpl.class);
	
	@Autowired
	private RouteServiceUtility routeServiceUtility;
	
	public boolean findRoute(String source,String destination) {
		logger.info("RouteFindServiceImpl >> FindRoute process started execution");
		boolean isConnected = routeServiceUtility.compareCities(source, destination);
		logger.info("RouteFindServiceImpl >> FindRoute process final resposne >> "+isConnected);
		return isConnected;
	}
}
