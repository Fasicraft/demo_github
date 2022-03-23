package Group_C;

public class localVariable {
	
	public void methodone() {
		
		int i=30;// local variable
		
		System.out.println("value of i:" + i);
		
		}
	public void methodtwo() {

		int n =45; // local variable
		
		System.out.println("value of n:" + n);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	localVariable anyname = new localVariable(); // creating an object and 'anyname' is reference variable
	
	anyname.methodone(); //calling method one
	anyname.methodtwo(); // calling method two
	
			
			


	
	}

}
