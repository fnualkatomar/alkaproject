package assignment2.polymorphism.compiletime;

public class CompileTimePolymorphismMain {

	public static void main(String[] args) {
		CompileTimePolymorphism compileTimePolymorphism = new CompileTimePolymorphism();
		
		compileTimePolymorphism.sum(1, 1);
		compileTimePolymorphism.sum(1,1.0f, 1);
		compileTimePolymorphism.sum(1,1, 1);
		compileTimePolymorphism.sum(1,1, 1.0f);

	}

}
