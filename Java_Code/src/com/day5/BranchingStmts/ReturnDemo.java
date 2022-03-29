package com.day5.BranchingStmts;

public class ReturnDemo {

	public static void main(String[] args) {
	public static void printAMessage() {
		
		for (int k=25; k<31; k++) {
			System.out.println(checkEven(k));
			
		}
		boolean Check Even(a){
			if (a%2 == 0){
				System.out.println(a + "is even number");
				return true;
				
			}
			System.out.println(a + "is odd number");
			return false;
		
		}
	}

}
