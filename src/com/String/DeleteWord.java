package com.String;

import java.util.Scanner;

public class DeleteWord {

	public static void main(String[] args) {
		String s="I LOVE MY INDIA";
		  String s1="";
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the word");
		 
		 String c=sc.next();
			  
			 s1=s.replace(c, "");
			 
System.out.println(s1);
		 
		 

	}

}
