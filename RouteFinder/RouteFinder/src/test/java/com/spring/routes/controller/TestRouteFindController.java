package com.spring.routes.controller;

import static org.junit.Assert.assertNull;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.routes.RoutesServerApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RoutesServerApplication.class)
public class TestRouteFindController {
	
    @MockBean
	private TestRestTemplate restTemplate;

	@Test
	public void exampleTest() {
		String body = this.restTemplate.getForObject("/RouteFinder/login", String.class);
		assertNull(body);
	}	
	
	@Test
	@Ignore
	public void whenValidName_thenEmployeeShouldBeFound() {
		 //Mockito.when(iRouteFindService.findRoute("NewYork", "NewYork")).thenReturn(true);
	     //assertThat(found.getName()).isEqualTo(name);
	 }
}
