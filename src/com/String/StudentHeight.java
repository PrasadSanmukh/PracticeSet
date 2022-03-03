package com.String;

import java.util.Scanner;

public class StudentHeight {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in); 	 
		int noOfStudents;
		double result=1, sum=0;
		 
				System.out.println("Enter the no ofstudent ");
				noOfStudents = sc.nextInt();
		double[] heightOfStduents=new double[noOfStudents];
		for(int i=0;i<noOfStudents;i++) {
				System.out.println("Enter the height ofstudent in feet");
				heightOfStduents[i] = sc.nextInt();

	}
		for(int i=0;i<noOfStudents;i++) {
			
			 sum=sum+heightOfStduents[i];

}
		result=sum/noOfStudents ;
		System.out.println("Enter the average height ofstudent "+result);
}
}