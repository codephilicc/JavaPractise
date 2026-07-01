package com.Learn.learn;

public class Test {

	public  static void reverseString(String s) {
		 
		 String s1 = ""	;
			
		 for(int i =0;i<s.length();i++) {
				s1=s.charAt(i) + s1;
			}
		 System.out.println(s1);
	}	
	
	
public static void main(String[] args) {
	
	String s2 ="geeks quiz practice code";
	reverseString(s2);
	
}
	

}


