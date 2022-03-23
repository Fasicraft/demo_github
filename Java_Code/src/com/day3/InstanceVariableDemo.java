package com.day3;

public class InstanceVariableDemo {

	int age=25; // <----Instance Variable declared outside methods
	
	public void methodone() {
		int k = 30; // local variable
		System.out.println("Value of k:" + k);
		System.out.println("Value of age:" + age);
	}

	public static void main(String[] args) {
		InstanceVariableDemo m1 = new InstanceVariableDemo();
		m1.age = 35;
		m1.methodone();
		
		System.out.println();
		InstanceVariableDemo m2 = new InstanceVariableDemo();
		m2.methodone();
		
		InstanceVariableDemo m3 = new InstanceVariableDemo();
		m3.methodone();
		
	}
}
