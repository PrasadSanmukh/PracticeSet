package com.String;

import java.util.Scanner;

public class NoOfWords {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the sentence");
		 String r=sc.nextLine();
	 String[] words=r.split(" ");
	 int count=0;
		 for(String w:words) {
			 System.out.println(w);
			 count++;
		 }
		 System.out.println("the no of words "+count);
	}
}
