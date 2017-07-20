package com.revature.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.util.UserInput;

public class UserInputTest {
	
	private static UserInput ui = new UserInput();
	
	@BeforeClass
	public static void setUpBeforeClass(){
		
		ui = new UserInput();
		
	}
	
	@Test
	public void testInputAge(){
		
		assertFalse("Check negative age returns false", ui.inputAge(-1));
		
	}
	
	@Test
	public void testInputName(){
		
		assertFalse("Check empty string returns false", ui.inputName(""));
		
	}
	
	@Test
	public void testShoe(){
		
		assertEquals(true, ui.inputShoes("Nike"));
		
		assertFalse("Testing knock-off shoes are false", ui.inputShoes("Under Armour"));
		
		assertTrue("Testing adidas return true", ui.inputShoes("adidas"));
		
	}
	
	@AfterClass
	public static void cleanUpAfterClass(){
		
		ui = null;
		
	}
	

}
