package com.spring.routes.service;

import org.springframework.stereotype.Service;

@Service
public interface IRouteFindService {
	public boolean findRoute(String source,String destination);
}
