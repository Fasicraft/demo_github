package com.day3;

class EmpInfo {
	String name = "Jamie foxx"; //instance variable
	Static string city = "NYC" //static variable
			
}			
			
	public class StaticVariableDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Employee name:" + EmpInfo.name);
		System.out.println("Employee city" + EmpInfo.city);
		
		EmpInfo m1 = new EmpInfo();
		m1.name = "Ashenafi";
		m1.city = "Addis Abeba";
		
		System.out.println("Employee name:" + EmpInfo.m1.name);  //Ashenafi
		System.out.println("Employee city" + EmpInfo.m1.city);  //Addis
		
		System.out.println("/n");
		
		EmpInfo m2 = new EmpInfo();
		System.out.println("Employee name:" + EmpInfo.m2.name); ////jamie
		System.out.println("Employee city:" + EmpInfo.m2.city); //nyc
		
	}
	

}
