package com.day3;

public class LocalVariableDemo {
	
	public void methodone(){
		int j=25;          //<----local variable
		System.out.println("value of j:" +j); //25
	}
	public void methodtwo() {
		int k = 30;  // local variable
		int j = 24;
	
		System.out.println("value of k:" + k); //30
		String age;
		System.out.println("value of j:" + j); //35
}
	public static void main(String[] args) {
		
		//object created
		LocalVariableDemo m1 = new LocalVariableDemo();
		
		//call the methods inside the class
		m1.methodone();
		m1.methodtwo();
		

	}

}
