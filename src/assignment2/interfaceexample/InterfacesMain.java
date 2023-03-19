package assignment2.interfaceexample;

public class InterfacesMain {

	public static void main(String[] args) {
		Dog dog = new Dog();
		System.out.println(dog.foodType());
		System.out.println(dog.habitat());
		System.out.println(dog.isDanger());
		
		Tiger tiger = new Tiger();
		System.out.println(tiger.foodType());
		System.out.println(tiger.habitat());
		System.out.println(tiger.isDanger());
		
		Bird bird = new Bird();
		System.out.println(bird.foodType());
		System.out.println(bird.habitat());
		System.out.println(bird.isDanger());
		

	}

}
