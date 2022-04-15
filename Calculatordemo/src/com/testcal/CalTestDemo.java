package com.testcal;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.calc.CalculatorDemo;

public class CalTestDemo {

	CalculatorDemo cl = new CalculatorDemo();
	
	@Test
	public void additionTest() {
		Assert.assertEquals(20,cl.Addition(10, 10));
	}
 
}
