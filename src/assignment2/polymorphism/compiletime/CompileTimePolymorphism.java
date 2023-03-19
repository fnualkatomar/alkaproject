package assignment2.polymorphism.compiletime;

public class CompileTimePolymorphism {

	public float sum(int a, int b) {
		System.out.println("I am in BOTH int args SUM Method");
		return a + b;
	}

	public float sum(int a, int b, int c) {
		System.out.println("I am in THREE int args SUM Method");
		return a + b + c;
	}

	public float sum(int a, float b, int c) {
		System.out.println("I am in TWO int(1-3) one Float(2) args SUM Method");
		return a + b + c;
	}

	public float sum(int a, int b, float c) {
		System.out.println("I am in TWO int(1-2) one Float(3) args SUM Method");
		return a + b + c;
	}

}
