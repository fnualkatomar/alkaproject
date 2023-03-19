package assignment2.abstractexample;

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		// Common Features
		System.out.println(dog.haveFamily());
		System.out.println(dog.protectKids());
		//Vary Features
		System.out.println(dog.isDanger());
		System.out.println(dog.foodType());
		
		System.out.println("====================================");
		Tiger tiger = new Tiger();
		// Common Features
		System.out.println(tiger.haveFamily());
		System.out.println(tiger.protectKids());
		//Vary Features
		System.out.println(tiger.isDanger());
		System.out.println(tiger.foodType());
	}

}
