package com.revature.day2.driver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Driver2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		try{
			
			recursion();
			
		}
		
		catch(Error e){
			e.printStackTrace();
			System.out.println("we made it");
			
		}
		
		finally{
			
			System.out.println("We really did");
		}
		
		System.out.println(5+5);
		
/*		boolean fl = false;
		
		while(fl){
			
			System.out.println("hi");
		}*/

		/*try{
			method1();
			System.out.println("After exception");
		}catch(CustomException e){
			System.out.println("custom exception thrown");
		}catch(Exception e){
			System.out.println("regular exception thrown");
		}finally{
			System.out.println("Hello there exception");
		}*/
		//Integer.parseInt("Hi");
	}

	public static Object recursion(){
		
		List<Integer> li = new ArrayList<Integer>();
		
		for(;;){
			
			li.add(1);
			
		}
		
	}
	
	public static void method1() throws Exception {

		method2();

	}

	public static void method2() throws Exception {

		method3();

	}

	public static void method3() throws Exception {

		method4();

	}

	public static void method4() throws Exception {

		//throw new CustomException();
		throw new Error();
	}

	/*
	 * public static void method1(){
	 * 
	 * method2();
	 * 
	 * }
	 * 
	 * public static void method2(){
	 * 
	 * method3();
	 * 
	 * }
	 * 
	 * public static void method3(){
	 * 
	 * method4();
	 * 
	 * }
	 * 
	 * public static void method4(){
	 * 
	 * throw new RuntimeException();
	 * 
	 * }
	 */

}
