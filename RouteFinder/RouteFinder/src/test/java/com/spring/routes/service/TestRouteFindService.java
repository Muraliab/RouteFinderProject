package com.spring.routes.service;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestRouteFindService {
	
	   private IRouteFindService routeFindServiceImpl;
	
	   @Before
	   public void setUp(){
		   routeFindServiceImpl = mock(IRouteFindService.class);
	   }
	   @Test
	   public void testFindRoute(){
	      when(routeFindServiceImpl.findRoute("Boston","NewYork")).thenReturn(true);
	      when(routeFindServiceImpl.findRoute("NewYork","Philadelphia")).thenReturn(false);
	      Assert.assertEquals(routeFindServiceImpl.findRoute("Boston","NewYork"),true);
	      Assert.assertEquals(routeFindServiceImpl.findRoute("NewYork","Philadelphia"),false);
	      verify(routeFindServiceImpl).findRoute("Boston","NewYork");
	      verify(routeFindServiceImpl).findRoute("NewYork","Philadelphia");
	   }
}
