package com.day1;

import java.util.Scanner;

public class EmployeeInfo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner input = new Scanner(System.in))
		{
			System.out.println("pls enter your name:");
			String empName =input.next();
			
			System.out.println("pls enter your age:");
			int empAge = input.nextInt();
			
			System.out.println("pls enter your salary:");
			double empSalary = input.nextDouble();
			
			System.out.println("pls enter your Bonus:");
			double empBonus = input.nextDouble();
			
			
			double totalSalary = empSalary + empBonus;
			
			
			System.out.println("Employee Name:" + empName);
			System.out.println("Employee age:" +empAge);
			System.out.println("Employee Salary:" +empSalary);
			System.out.println("Employee Bonus:" +empBonus);
			System.out.println("Employee Total Salary:" +totalSalary);
			
		}
		
	}

}
