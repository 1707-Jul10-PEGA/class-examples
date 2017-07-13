package com.revature.driver;

import org.apache.log4j.PropertyConfigurator;

import com.revature.service.TestService;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String log4jConfPath = "C:\\Revature\\repos\\class-examples\\Week_1\\Logging\\src\\log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);

		TestService ts = new TestService();
		
		ts.someMethod();
		
	}

}
