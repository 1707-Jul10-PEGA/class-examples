package com.revature.day2.string;

public class StringManip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Hello ";
		String str2 = " World";
		String str3 = "Goodbye";
		System.out.println(str1.replace(str2.charAt(2), str3.charAt(5)).substring(3,str1.length()).concat(str3.replaceAll(str3.substring(2, 4), str2)));
	}

}
