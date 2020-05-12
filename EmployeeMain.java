package com.practiseprograms;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("No of Employees:  ");
		int n=sc.nextInt();
		Employee emp[]= new Employee[n];
		for(int i=0;  i<n;  i++) {
			emp[i]=new Employee();
			emp[i].getData();
		}
		System.out.println("Search (eg. Wire or 3666):");
		String srch =sc.next();
		sc.close();
		int count=0;
		for(int i=0;  i<n;  i++) {
			if(emp[i].searchBot(srch)) {
				emp[i].displayData();
				count++;
				
			}
		}
		if(count==0) {
			System.out.println("No such Element Found");
		}		
	}

}
