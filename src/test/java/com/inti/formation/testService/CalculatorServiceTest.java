package com.inti.formation.testService;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.inti.formation.service.CalculatorService;

public class CalculatorServiceTest {
	
	CalculatorService calculService = new CalculatorService();
	
	@Test
	public void sumTest() {
		
		int a =5;
		int b= 6;
		int result = calculService.sum(a, b);
		assertEquals(11, result);
	}

}
