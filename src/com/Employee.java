package com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Employee {

	int employeeId;
	String employeeName;
	String employeeEmail;
	long employeeMobNo;
	Date employeeDOB;
	Date employeeDOJ;
	Scanner sc = new Scanner(System.in);

	// methods to access above variables
	void readEmployeeDetails() throws ParseException {
		System.out.println("Enter the Employee data");
		System.out.println("Enter the Employee id");
		int employeeId = sc.nextInt();
		System.out.println("Enter the  Employeename");
		String employeeName = sc.next();
		System.out.println("Enter the  EmployeeMobileNumber");
		long employeeMobNo = sc.nextLong();
		System.out.println("Enter the  EmployeeEmail");
		String employeeEmail = sc.next();
		System.out.println("Enter the  Employee dob in 'dd/MM/yyyy' ");
		String dob = sc.next();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		employeeDOB = sdf.parse(dob);
		System.out.println("Enter the  Employee doj in 'dd/MM/yyyy' ");
		String doj = sc.next();
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		employeeDOJ = sdf1.parse(doj);
	}

	void displayEmployeeDetails() {
		System.out.println("Entered the Student data ...............");
		System.out.println("Employee id = " + employeeId);
		System.out.println("Employee name = " + employeeName);
		System.out.println("Employee Email = " + employeeEmail);
		System.out.println(
				"Employee dob = " + employeeDOB.getDate() + "/" + employeeDOB.getMonth() + "/" + employeeDOB.getYear());
		System.out.println(
				"Employee doj = " + employeeDOJ.getDate() + "/" + employeeDOJ.getMonth() + "/" + employeeDOJ.getYear());

	}

	public static void main(String[] args) throws ParseException {

		Employee e = new Employee();
		e.readEmployeeDetails();
		e.displayEmployeeDetails();

	}

}
