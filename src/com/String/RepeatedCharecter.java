package com.String;

public class RepeatedCharecter {

	public static void main(String[] args) {
		String s="Prasad";
		  String s1="Prathm";
		 String s2="";
		  for(int i=0;i<s.length();i++) {
			   char ch=s.charAt(i);
			   
			  if(s1.indexOf(ch)==-1) {
				  s2=s2+ch;
			  }
		  }
		
	 
		
	 System.out.println(s2);

	}

}
