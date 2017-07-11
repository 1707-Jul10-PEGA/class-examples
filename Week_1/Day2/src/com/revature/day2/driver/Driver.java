package com.revature.day2.driver;

public class Driver {
	
	int i;
	
	char c;
	
	String str;
	
	float f;
	
	double d;
	
	long l;
	
	short s;
	
	byte b;
	
	boolean bo;
	
	Object o;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hi");
		
		int[] myArr;
		
		myArr = new int[5];
		
		myArr[3] = 67;
		
		System.out.println(myArr[3]);
		
		new Driver().printValues();
		
	}
	
	
	public void printValues(){
		
		System.out.println("int: "+i);
		System.out.println("char: "+(int)c);
		System.out.println("double: "+d);
		System.out.println("long: "+l);
		System.out.println("short: "+s);
		System.out.println("byte: "+b);
		System.out.println("boolean: "+bo);
		System.out.println("object: "+o);
		System.out.println("String: "+str);
		
	}
	
	/*public void printLocalValues(){
		
		int i;
		
		char c;
		
		String str;
		
		float f;
		
		double d;
		
		long l;
		
		short s;
		
		byte b;
		
		boolean bo;
		
		Object o;
		
		System.out.println("int: "+i);
		System.out.println("char: "+(int)c);
		System.out.println("double: "+d);
		System.out.println("long: "+l);
		System.out.println("short: "+s);
		System.out.println("byte: "+b);
		System.out.println("boolean: "+bo);
		System.out.println("object: "+o);
		System.out.println("String: "+str);
		
	}*/

}
