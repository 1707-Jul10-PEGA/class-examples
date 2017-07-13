package com.revature.driver;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.revature.pojo.BaseballCard;
import com.revature.pojo.BaseballCardComparator;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class<BaseballCard> card = BaseballCard.class;
		
		for(Method m : card.getMethods()){
			
			System.out.println("Name : " + m.getName() + " with return type: " + m.getReturnType());
			
		}

		BaseballCard ken = new BaseballCard("Ken Griffie Jr.", "Center Field", 6.3, 195, 1998);
		
		BaseballCard ken2 = ken;
		
		System.out.println(ken2 == ken);
		
		ken2 = new BaseballCard("Ken Griffie Jr.", "Center Field", 6.3, 195, 1998);
		
		System.out.println(ken2 == ken);
		
		System.out.println(ken2.equals(ken));
		
		ken2.setYear(1997);
		
		ken.setName("ken griffie jr.");
		
		System.out.println(ken2.equals(ken));
		
		BaseballCard arod = new BaseballCard("Alex Rodriquez", "shortstop", 6.0, 200, 1995);
		
		System.out.println(ken.compareTo(arod));
		
		System.out.println(ken.compareTo(ken2));
		
		List<BaseballCard> bcList = new LinkedList<BaseballCard>();
		
		bcList.add(ken);
		
		bcList.add(ken2);
		
		bcList.add(arod);
		
		bcList.add(new BaseballCard("Frank Thomas", null, 0, 0, 0));
		
		bcList.add(new BaseballCard("Sammy Sosa", null, 0, 0, 0));
		
		System.out.println(bcList);
		
		Collections.sort(bcList);
		
		System.out.println(bcList);
		
		Iterator<BaseballCard> bcIt = bcList.iterator();
		
		while (bcIt.hasNext()){
			
			bcIt.next().setValue(Math.random()*1000);
			
		}
		
		Collections.sort(bcList, new BaseballCardComparator());
		
		System.out.println(bcList);
		
	}

}
