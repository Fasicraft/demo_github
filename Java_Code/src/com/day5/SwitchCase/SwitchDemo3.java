package com.day5.SwitchCase;

public class SwitchDemo3 {

	public enum vowel {a,e,i,o,u}


	private static final vowel Vowel = null;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vowel[]characters = vowel.values();
		
		for(Vowel now: characters) {
			
			switch(now) {
			case a:
				System.out.println("a" is vowel ");
				break;
			case e:
				System.out.println("e" is vowel ");
				break;
			case i:
				System.out.println("i" is vowel");
				break;
			case o:
				System.out.println("o" is vowel ");
				break;
			case u:
				System.out.println("u" is Vowel ");
				break;
			}
		}
	}

}
