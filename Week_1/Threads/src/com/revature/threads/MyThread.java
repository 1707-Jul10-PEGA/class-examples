package com.revature.threads;

public class MyThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i < 101; i++){
			
			Thread t = Thread.currentThread();
			
			t.setPriority(Thread.MAX_PRIORITY);
			
			System.out.println("Inside thread " + t.getName());
			
			System.out.println("The priority is " + t.getPriority());
			
			System.out.println("Number " + i);
			
			try {
				t.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	

}
