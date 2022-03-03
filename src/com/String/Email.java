package com.String;

import java.util.Scanner;

public class Email {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the email");
		 String s=sc.nextLine();
		 System.out.println(s.contains("@"));  
		 System.out.println(s.contains("."));  
	}

}
