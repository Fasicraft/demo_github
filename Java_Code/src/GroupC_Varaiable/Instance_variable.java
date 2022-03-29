package GroupC_Varaiable;

public class Instance_variable {
	
	int age = 35; //Instant variable created outside methods
	public void methodone() {
		int f = 15; //local variable
		System.out.println("value of f: "+ f);
		System.out.println("value of age: "+ age);
		
		
	}
	
	public void methodtwo() {
		
	int b = 25;//local variable
	}
	
	system.out.println("value of b: " + b);
	system.out.println("value of age: "+ age);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Instance_variable  ins= new Instance_variable();
		
		ins.methodone();
		ins.methodtwo();
	}

}
