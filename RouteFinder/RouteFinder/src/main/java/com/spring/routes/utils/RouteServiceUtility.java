package com.spring.routes.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

@Component
public class RouteServiceUtility {

	private static final Logger logger = LogManager.getLogger(RouteServiceUtility.class);
	
	@Autowired
	ResourceLoader resourceLoader;
	
	public List<String> getCities() {
		logger.info("RouteServiceUtility >> getCities process started execution");
		List<String> cities = new ArrayList<String>();
		Resource resource = resourceLoader.getResource("classpath:cities.txt");
		try {
			File file = resource.getFile();
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				cities.add(sc.next());
			}
			sc.close();
			System.out.println("Cities >> " + cities);
		} catch (Exception e) {
			e.printStackTrace();
		}
		logger.info("RouteServiceUtility >> getCities process completed execution");
		return cities;
	}

	public boolean compareCities(String source, String destination) {
		logger.info("RouteServiceUtility >> compareCities process started execution");
		List<String> cities = getCities();
		boolean isFlag= false;
		for (String value : cities) {
			String[] sourceCities = value.split(",");
			if ((sourceCities[0].equals(source) && sourceCities[1].equals(destination))
					|| (sourceCities[0].equals(destination) && sourceCities[1].equals(source))) {
				isFlag = true;
				logger.info("RouteServiceUtility >> compareCities process result "+isFlag);
				break;
			}else {
				isFlag = false;
			}
		}
		logger.info("RouteServiceUtility >> compareCities process completed execution with result"+isFlag);
		return isFlag;
	}

	public static void main(String args[]) {
		RouteServiceUtility routeServiceUtility = new RouteServiceUtility();
		routeServiceUtility.compareCities("NewYork1","Boston");
		routeServiceUtility.compareCities("Philadelphia","Newark1");
		routeServiceUtility.compareCities("Newark1","Boston");
		routeServiceUtility.compareCities("Trenton","Albany1");
	}
}
