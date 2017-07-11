package com.revature.day2.garbage;

import com.revature.day2.pojo.Planet;

public class GarbageCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Planet alderaan = new Planet("Alderaan");
		
		alderaan = null;
		
		System.gc();
		
		
		for (int i = 1; i < 1000000; i++){
			
			new Planet("planet #"+i);
			
			if(i%1000==0){
				
				try {
					Thread.currentThread().sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.gc();
				
			}
			
		}
		

	}

}
