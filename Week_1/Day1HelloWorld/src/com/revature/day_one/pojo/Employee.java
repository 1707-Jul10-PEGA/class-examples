package com.revature.day_one.pojo;

public class Employee {
	
	private static int employeeCount = 0;
	
	private String name;
	
	/*public static Employee makeEmployeeNamed(String name){
		
		Employee e = new Employee();
		
		e.setName(name);
		
		return e;
		
	}*/
	
	public static int getEmployeeCount(){
		
		return employeeCount;
		
	}
	
	private static void setEmployeeCount(int newEmployeeCount){
		
		employeeCount = newEmployeeCount;
	}
	
	public void setName(String name){
	
		this.name = name;
	}
	
	public String getName(){
		
		return name;
		
	}
	
	public Employee(){
		
		int count = getEmployeeCount();
		
		setEmployeeCount(++count);
		
		setName("default");
		
	}
	
	public Employee(String name){
		this();
		setName(name);
		
	}
	
/*	public Employee(){
		super();
	}*/

}
