package com.revature.day2.pojo;

public class Planet {
	
	public String name;
	
	public Planet(String name){
		
		this.name = name;
		
	}
	
	@Override
	public void finalize(){
		
		System.out.println("Planet " + name + " has been destroyed");
		
	}

}
