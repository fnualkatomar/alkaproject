package assignment2.polymorphism.compiletime;

public class C {

	public static void main(String[] args) {
		B b = new B();
		
		b.methodA();// A & B but it will call B class, A method
		b.methodB();
		
		b.methodC();
		
		
	}

}
