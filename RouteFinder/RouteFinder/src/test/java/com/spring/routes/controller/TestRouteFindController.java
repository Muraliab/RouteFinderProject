package com.spring.routes.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.spring.routes.RoutesServerApplication;
import com.spring.routes.entity.ResponseEntity;
import com.spring.routes.service.impl.RouteFindServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=RoutesServerApplication.class)
public class TestRouteFindController {
	
	private MockMvc mockMvc;
	
    @Mock
    private RouteFindServiceImpl findServiceImpl;
    
    @InjectMocks
    private RouteFindController findController;
    
    @Autowired
	private WebApplicationContext webApplicationContext;
    
    @InjectMocks
    private ResponseEntity respone;
    
    @Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
    
	@Test
	public void testLogin() throws Exception {
		mockMvc.perform(get("/RouteFinder/login").accept(MediaType.APPLICATION_JSON_VALUE)).andExpect(status().isOk());
	}
	
	@Test
	public void testFindRoute() throws Exception {
		mockMvc.perform(get("/RouteFinder/findRoute").accept(MediaType.APPLICATION_JSON_VALUE).param("source", "Boston").param("destination", "NewYork")).andExpect(status().isOk());
	}
	
	@Test
	public void testFindRouteFailed() throws Exception {
		mockMvc.perform(get("/RouteFinder/findRoute").accept(MediaType.APPLICATION_JSON_VALUE)).andExpect(status().isBadRequest());
	}
}
