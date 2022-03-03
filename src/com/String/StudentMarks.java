package com.String;

import java.security.PublicKey;
import java.text.ParseException;
import java.util.Scanner;

public class StudentMarks {
	Scanner sc  = new Scanner(System.in); 	 
	int rollNo;
	int sub1;
	int sub2;
	int sub3;
	
	 public void setStudentsMarks() {
			System.out.println("Enter the student roll no");
			 rollNo = sc.nextInt();
			System.out.println("Enter the student marks on sub1");
			 
			sub1= sc.nextInt();
			if(sub1>100) {
				System.out.println("please enter below 100 marks");
				 sub1 = sc.nextInt();
			}
			
			System.out.println("Enter the student marks on sub2");
			 
			sub2= sc.nextInt();
			if(sub2>100) {
				System.out.println("please enter below 100 marks");
				sub2 = sc.nextInt();
			}
			System.out.println("Enter the student marks on sub3");
			 
			sub3= sc.nextInt();
			if(sub3>100) {
				System.out.println("please enter below 100 marks");
				sub3 = sc.nextInt();
			}
			
	}
	 public void displayStudentsMarks() {
		 System.out.println("Student roll no is"+rollNo);
		 System.out.println("Student average marks is"+(sub1+sub2+sub3)/3);
		 
	 }
	public static void main(String[] args) {

		StudentMarks[] s=new StudentMarks[8];
		
	 StudentMarks studentMarks;
			for(int i=0;i<s.length;i++) {
				studentMarks=new StudentMarks();
				studentMarks.setStudentsMarks();
				s[i]=studentMarks;
			}
			for(int i=0;i<s.length;i++) {
				 System.out.println("Student Marks detais is");
				 
				s[i].displayStudentsMarks();;
			}

}
}
