package com.revature.day2.wrapper;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer i = new Integer(5);
		
		int k = i;
		
		i = 7;
		
		int j = addFive(3);
		
		Integer l = addOne(new Integer(2));
		
		printAll(0, 1, 2, 3, 4);
		
		printAll();

	}
	
	public static Integer addFive(Integer i){
		
		return i+5;
		
	}
	
	public static int addOne(int i){
		
		return i+1;
		
	}
	
	public static void printAll(int x, int ... intArr){
		
		System.out.println(x);
		
		for(int i : intArr){
			
			System.out.println(i);
			
		}
		
	}

}
