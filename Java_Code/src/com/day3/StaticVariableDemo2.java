package com.day3;

class EmpInfo {
	
	String name ="Jamie foxx"; //instance variable
	static String city = "NYC"; //static variable
			
}			
			
	public class StaticVariableDemo2 {

	public static void main(String[] args) {
		
		EmpInfo m1 = new EmpInfo();//object created
		System.out.println("Employee name:" + m1.name);
		System.out.println("Employee city:" + m1.city);
		
		
		
		m1.name = "Ashenafi";
		m1.city = "Addis Abeba";
		
		System.out.println("Employee name:" + m1.name);  //Ashenafi
		System.out.println("Employee city" + m1.city);  //Addis
		
		System.out.println("/n");
		
		EmpInfo m2 = new EmpInfo();
		System.out.println("Employee name:" + m2.name); //jamie
		System.out.println("Employee city:" + m2.city); //nyc
		
	}
	

}
