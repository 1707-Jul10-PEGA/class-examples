package com.revature.collections.driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] stringArray = {"Foo", "Bar", "Foo", "New", "Testing"};
		ArrayList<String> strings = new ArrayList<String>();
		/*
		strings.add("Foo");
		strings.add("Bar");
		strings.add(1, "New");*/
		
		strings.addAll(Arrays.asList(stringArray));
		
		strings.remove("New");
		
		for(String s : strings){
			
			System.out.println(s);
			
		}
		
		System.out.println(strings);
		
		Set<String> stringSet = new HashSet<String>();
		
		/*System.out.println(stringSet.add("Foo"));
		System.out.println(stringSet.add("Foo"));*/
		
		stringSet.addAll(Arrays.asList(stringArray));
		
		System.out.println(stringSet);
		
		TreeSet<String> treeStringSet = new TreeSet<String>();
		
		treeStringSet.addAll(Arrays.asList(stringArray));
		
		treeStringSet.add("Car");
		
		System.out.println(treeStringSet);
		
		Iterator<String> stringIt = stringSet.iterator();
		
		while(stringIt.hasNext()){
			
			String s = stringIt.next();
			System.out.println("Element: " + s);
			if("Testing".equals(s)){
				stringIt.remove();
			}
			
		}
		
		System.out.println("List after removal: " + stringSet);
		
		Map<String, String> map = new HashMap<>();
		
		map.put("one", "Foo");
		map.put("forty-seven", "Bar");
		map.put("three", "Pizza");
		
		System.out.println(map.get("forty-seven"));
		System.out.println(map);
		
	}

}
