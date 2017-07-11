package com.revature.day_one.driver;

import com.revature.day_one.pojo.Employee;

public class Driver {
	
	char y = 'y';

	public static void main(String[] args) {
		
		//System.out.println(y);
		
		/*int x = Integer.parseInt(args[0]);
		
		System.out.println("Hello World, you gave me " + (x+5));
		
		for(int y = 0; y <10; y++){
			
			int z = x;
			
			System.out.println(y);
			
		}
		
		{String z = "hi";	
		}*/
		
		//System.out.println(z);
		//x = z-2;
		
		Employee blake = new Employee();
		
		blake.setName("Blake");
		
		System.out.println(blake.getName());
		
		//--------> bad practice blake.getEmployeeCount();
		
		for(int x = 0; x < 12; x++){
			
			new com.revature.day_one.pojo.Employee("John");
			
		}
		
		System.out.println(Employee.getEmployeeCount());
		
	}
	
	public void doStuff(){
		
		System.out.println("my letter is" + y);
		
		//System.out.println(x);
		
	}
	
}
