package com.String;

public class ReverseString {

	public static void main(String[] args) {
		 String s="I love my India";
		  char[] c=new char[s.length()];
	for(int i=0;i<s.length();i++) {
		c[i]=s.charAt(i);
		 
	}
	for(int i=c.length-1;i>=0;i--) {
		 System.out.println(c[i]);
	}
	}

}
