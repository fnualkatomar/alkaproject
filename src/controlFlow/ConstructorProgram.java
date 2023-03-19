package controlFlow;

public class ConstructorProgram {

	
	ConstructorProgram() {
		System.out.println("hello");

	}

	ConstructorProgram(int a, int b) {
		int c = a + b;
		System.out.println(c);

	}

	public static void main(String[]args) {
		
		ConstructorProgram objt1=new ConstructorProgram();
		ConstructorProgram objt2=new ConstructorProgram(2,7);
		
		
		
		
		
		
	} 
	
	
	
	
	
	
}
