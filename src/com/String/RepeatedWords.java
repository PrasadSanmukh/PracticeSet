package com.String;

import java.util.Scanner;

public class RepeatedWords {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the sentence");
		 String r=sc.nextLine();
	 String[] words=r.split(" ");
	 
		 for(int i=0;i<words.length;i++) {
			 for(int j=i+1;j<words.length;j++) {
				 if(words[i].equals(words[j]))
				 System.out.println(words[i]);
			 }
		 }
		 

	}

}
