package com.revature.day2.nested;

public class NestedClasses {

	private class Thing1{
		
		
	}
	
	private class Thing2{
		
		Thing1 thing = new Thing1();
		
	}

	public Thing1 thing = new Thing1();
	
}
