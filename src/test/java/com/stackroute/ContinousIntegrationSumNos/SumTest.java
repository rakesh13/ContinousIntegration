package com.stackroute.ContinousIntegrationSumNos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SumTest {
	
	App app;
	
	@Before
	public void init()
	{
		app=new App();
	}
	
	@Test
	public void testSum()
	{
		int result=app.sumNos(10, 20);
		assertEquals(30,result);
	}
	@Test
	public void negativeTestSum()
	{
		int result=app.sumNos(20, 30);
		assertNotEquals(30,result);
	}
}
