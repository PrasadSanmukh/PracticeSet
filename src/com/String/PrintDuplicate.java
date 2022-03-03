package com.String;

public class PrintDuplicate {

	public static void main(String[] args) {
		  String s="I love my India";
		  char[] c=new char[s.length()];
	for(int i=0;i<s.length();i++) {
		c[i]=s.charAt(i);
	}
	for(int i=0;i<c.length;i++) {
		 for(int j=i+1;j<c.length;j++) {
			 if(c[i]==c[j]) {
			 System.out.println(c[i]);
			 
		 }
			
		}

		}

	}

}
