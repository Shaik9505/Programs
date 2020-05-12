package com.practiseprograms;

import java.util.Scanner;

public class Employee {
	private String id= null;
	private String name=null;
	private String addr=null;
	private int sal=0;
	
	void getData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Employee ID :    ");
		id=sc.next();
		System.out.println("Employee Name :    ");
		name=sc.next();
		System.out.println("Employee Address :    ");
		addr=sc.next();
		System.out.println("Employee Salary :    ");
		sal=sc.nextInt();
		
	}
	boolean searchBot(String srch) {
		if(name.matches(srch) || id.matches(srch))
			return true;
		else
			return false;
	}
	void displayData() {
		System.out.println("Employee ID:  "  +id);
		System.out.println("Employee Name:  "  +name);
		System.out.println("Employee Address:  "  +addr);
		System.out.println("Employee Salary:  "  +sal);
	}
	

}
