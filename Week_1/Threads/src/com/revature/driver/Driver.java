package com.revature.driver;

import com.revature.threads.MyThread;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t = new MyThread();
		
		t.setName("Martha");
		
		t.start();
		
		Thread main = Thread.currentThread();
		
		char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p'};
		
		for(char x : arr){
			
			System.err.println("Inside thread " + main.getName());
			System.err.println("The priority is " + main.getPriority());
			System.err.println(x);
			try {
				main.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
