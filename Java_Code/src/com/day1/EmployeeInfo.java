package com.day1;

public class EmployeeInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String empFirstName="James";
		String empLastname="Foxx";
		
		int empAge = 38;
		
		double empSalary = 4345.33;
		
		double empBonus = 300;
		
		double totalSalary = empSalary + empBonus; //4345.33 +300
		
		System.out.println("Employee full name:" + empFirstName +" " + empLastname);
		System.out.println("Employee Age: " + empAge);
		System.out.println("Employee Salary: " + empSalary);
		System.out.println("Employee Bonus: " + empBonus);
		System.out.println("Employee Total Salary: " + totalSalary);
		
		
		
	}

}
