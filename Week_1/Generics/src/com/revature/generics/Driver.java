package com.revature.generics;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator<Integer> c = new Calculator<Integer>();
		
		System.out.println(c.add(7, 17));
		
		Calculator<Double> d = new Calculator<Double>();
		
		System.out.println(d.add(55.78, -144.3));
		
	}

}
